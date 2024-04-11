#include <string>
#include <map>

using namespace std;

int solution(string dirs) {
    int answer = 0;
    map<pair<pair<int,int>, pair<int,int>>, bool> M;
    int now_x=0, now_y=0,next_x=0, next_y=0;
    for(int i = 0; i < dirs.size(); i++){
        if(dirs[i] == 'U' && next_y+1 <= 5){ //단 좌표평면의 경계를 넘어가는 명령어는 무시한다.
            next_y++;
        }else if(dirs[i] == 'D' && next_y-1 >= -5){
            next_y--;
        }else if (dirs[i] == 'R' && next_x+1 <= 5){
            next_x++;
        }else if(dirs[i] == 'L' && next_x-1 >= -5){
            next_x--;
        }else{
            continue;
        }
        if (!M[{ { now_x, now_y }, { next_x, next_y } }] && !M[{ { next_x, next_y }, { now_x, now_y } }]) {
            M[{ { now_x, now_y }, { next_x, next_y } }] = true;
            answer++;
        }
        now_x= next_x; now_y = next_y;
    }
    return answer;
}