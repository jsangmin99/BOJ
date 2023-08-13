#include <string>
#include <vector>

using namespace std;

vector<string> solution(string my_string) {
    vector<string> answer;
    string word = "";
    
    for(char c : my_string){
        if(c != ' '){
            word += c;
        }else{
            if(!word.empty()){
                answer.push_back(word);
                word = "";
            }
        }
    }
    if(!word.empty())
        answer.push_back(word);
    return answer;
}