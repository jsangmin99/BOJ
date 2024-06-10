#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> array, vector<vector<int>> commands) {
    vector<int> answer;
    for(int i = 0 ; i < commands.size(); i++){
        vector<int>tmp;
        int start = commands[i][0];
        int end = commands[i][1];
        int k = commands[i][2];
        
        for(int j = start-1; j < end; j++){
            tmp.push_back(array[j]);
        }
        sort(tmp.begin(),tmp.end());
        answer.push_back(tmp[k-1]);
    }
    return answer;
}