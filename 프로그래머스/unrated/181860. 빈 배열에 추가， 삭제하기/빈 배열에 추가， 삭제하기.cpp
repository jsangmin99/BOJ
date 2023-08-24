#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr, vector<bool> flag) {
    vector<int> answer;
    for(int i =0; i < arr.size(); i++){
        if(flag[i]){
            for(int j = 0; j < (arr[i] * 2); j++){
                answer.push_back(arr[i]);
            }
        }
        else{
            int cnt = arr[i];
            while(cnt > 0){
                answer.pop_back();
                cnt--;
            }
        }
            
    }
    return answer;
}