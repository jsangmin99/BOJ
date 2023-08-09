#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr, int k) {
    vector<int> answer;
    for(int i : arr){
        if(k%2 ==1)
    		answer.push_back(i*k);
        else
            answer.push_back(i+k);
    }
    
    return answer;
}