#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> arr, int k) {
    vector<int> answer;
    for (int num : arr) {
    	if(find(answer.begin(), answer.end(), num) == answer.end()){
            answer.push_back(num);
            if(answer.size() ==k){
                break;
            }
        }
    }
    
    while(answer.size() < k){
        answer.push_back(-1);
    }
    return answer;
}