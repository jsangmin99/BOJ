#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> emergency) {
    vector<int> answer;
    vector<int> rank;
    rank = emergency;
    sort(rank.begin(), rank.end(), greater());
    int count =1; 
    for(int i = 0; i < emergency.size(); i++){
        for(auto r : rank){
            if(r ==emergency[i]){
                answer.push_back(count);
            }
            else count++;
        }
        count= 1;
    }
    
    return answer;
}