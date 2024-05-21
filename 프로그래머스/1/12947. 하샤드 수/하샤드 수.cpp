#include <string>
#include <vector>
#include <string>
using namespace std;

bool solution(int x) {
    bool answer = true;
    string s = to_string(x);
    int sum =0;
    for(int i =0; i< s.size(); i++){
        sum += (s[i]-'0');
    }
    if(x%sum!=0)answer = false;
    return answer;
}