#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr, vector<vector<int>> queries) {
    vector<int> answer;
    for(vector<int> q : queries){
        int i = q[0];
        int j = q[1];
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    answer = arr;
    return answer;
}