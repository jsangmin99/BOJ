#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr, vector<vector<int>> intervals) {
    vector<int> answer;
    for(vector<int> i : intervals){
        int start = i[0];
        int end = i[1];
        for(int j = start; j <= end; j++){
            answer.push_back(arr[j]);
        }
    }
    return answer;
}