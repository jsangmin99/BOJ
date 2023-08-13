#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(string myString, string pat) {
    int answer = 0;
    transform(myString.begin(), myString.end(),myString.begin(), ::tolower);
    transform(pat.begin(),pat.end(),pat.begin(), ::tolower);
    if(myString.size() < pat.size())
        return 0;
    for(int i = 0; i <= (myString.size() - pat.size()); i++){
        bool check = true;
        for(int j =0; j <pat.size(); j++){
            if(myString[i+j] != pat[j]){
                check = false;
                break;
            }
        }
        if(check){
        answer = 1;
        }
    }
    
    return answer;
}