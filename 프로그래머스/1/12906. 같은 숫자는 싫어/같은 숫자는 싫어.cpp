#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> arr) 
{
    vector<int> answer;
    answer.push_back(arr[0]);
    for(int i = 0; i < arr.size(); i++){
        if(answer.back() == arr[i]){
            continue;
        }
        answer.push_back(arr[i]);
    }

    return answer;
}