#include <string>
#include <vector>

using namespace std;

vector<int> solution(string my_string) {
    vector<int> answer (52,0);
    
    for(char c : my_string){
        if('A' <= c && 'Z' >= c){
            answer[c-'A']++;
        }else if('a' <= c && 'z' >= c){
            answer[c-'a'+26]++;
        }
    }
    return answer;
}