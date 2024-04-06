#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> array) {
    vector<int> answer;
    int max =0;
    int max_idx=0;
    for(int i =0; i < array.size(); i++){
        if(max < array[i]){
            max = array[i];
            max_idx = i;
        }
    }
    answer.push_back(max);
    answer.push_back(max_idx);
    return answer;
}