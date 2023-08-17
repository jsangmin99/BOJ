#include <string>
#include <vector>

using namespace std;

vector<vector<int>> solution(vector<vector<int>> arr) {
    vector<vector<int>> answer;
    int max_len = max(arr.size(), arr[0].size());
    
    for(int i =0; i<arr.size(); i++){
        while(arr[i].size() < max_len){
            arr[i].push_back(0);
        }
    }
    while(arr.size() < max_len){
        arr.push_back(vector<int>(max_len, 0));
    }
    return arr;
}