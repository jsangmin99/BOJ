#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<string> keyinput, vector<int> board) {
    vector<int> answer;
    int x = 0;
    int y = 0;
    int mx=board[0]/2, my=board[1]/2;
    for(int i = 0; i < keyinput.size(); i++){
        if(keyinput[i] == "left" && -mx <= x-1) x--;
        else if(keyinput[i] == "right"&& mx >= x+1) x++;
        else if(keyinput[i] == "up"&& my >= y+1) y++;
        else if(keyinput[i] == "down"&& -my <= y-1) y--;
    }
    answer.push_back(x);
    answer.push_back(y);
    return answer;
}