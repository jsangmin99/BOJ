#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> arr, vector<int> delete_list) {
    vector<int> answer;
    for(int n : delete_list){
        auto it = find(arr.begin(), arr.end(), n);
        if(it != arr.end())
            arr.erase(it);
    }
    return arr;
}