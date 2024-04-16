#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    string s;
    for(int i = 0; i < n; i++){
        answer++;
        s = to_string(answer);
        while(answer % 3 == 0 || s.find('3') != string::npos){
            answer++;
            s = to_string(answer);
        }
    }    
    return answer;
}