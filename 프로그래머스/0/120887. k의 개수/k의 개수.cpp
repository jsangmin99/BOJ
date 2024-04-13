#include <string>
#include <vector>

using namespace std;

int solution(int i, int j, int k) {
    int answer = 0;
    char sk = k + '0';
    for(int n = i; n <= j; n++){
        string s = to_string(n);
        for(int m = 0; m < s.size(); m ++){
            if(s[m] == sk){
                answer++;
            }
        }
    }
    return answer;
}