#include <string>
#include <vector>

using namespace std;

vector<string> solution(string my_string) {
    vector<string> answer;
    string w;
    for(char c : my_string)
    {
        if(c != ' '){
            w += c;
        }
        else{
            if(!w.empty()){
                answer.push_back(w);
                w = "";
            }
        }
    }
    if(!w.empty()){
        answer.push_back(w);
    }
    return answer;
}