#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr, vector<vector<int>> queries) {
    vector<int> answer;
    for(vector<int> q : queries){
        int s = q[0];
        int e = q[1];
        int k = q[2];
        int min = -1;
        
        for(int i = s; i <= e; i++){
            if(arr[i] >k){
                if(min == -1 || min > arr[i]){
                    min = arr[i];
                }
            }
        }
        answer.push_back(min);
    }
    return answer;
}