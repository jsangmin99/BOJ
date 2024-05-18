#include <string>
#include <vector>


using namespace std;

int min(int a, int b) {
    return a > b ? b : a;
}

int solution(string name) {
    //ABCDEFGHIJKLM NOPQRSTUVWXYZ
    // 알파벳선택 움직임
    //아스키 코드를 활용
    // 만약 M의 숫자보다 작으면 오른쪽 알파벳으로 이동
    //               크면 왼쪽으로 이동
    /*
    BBAAAAAB
    ABAAAAABA
    */
 	//왼쪽으로 갈지 오른쪽으로 갈지가 핵심인듯
    
    // 
    int answer = 0;
    int move = name.size() - 1;
    for(int i =0; i < name.size(); i++){
        answer += (name[i] - 'A' <= 13 ? name[i] - 'A' : 26 - (name[i] - 'A'));
        
        int index2 = i+1;
        while(index2 < name.size() && name[index2] == 'A')
            index2++;
        move = min(move, i + name.size() - index2 + min(i, name.size() - index2));
    }
    return answer+move;
}