#include <string>
#include <vector>

using namespace std;

vector<string> solution(vector<string> str_list) {
    vector<string> answer;
    int lIndex = -1;
    int rIndex = -1;
    
    for(int i =0; i <str_list.size(); i++){
        if(str_list[i] == "l"){
            lIndex = i;
            break;
        }
        if(str_list[i] == "r"){
            rIndex = i;
            break;
        }
    }
    if(lIndex != -1 && rIndex == -1){
        answer.insert(answer.begin(),str_list.begin(),str_list.begin() + lIndex);
    }else if(lIndex == -1 && rIndex != -1){
        answer.insert(answer.begin(),str_list.begin()+ rIndex + 1 ,str_list.end());
    }
    
    return answer;
}