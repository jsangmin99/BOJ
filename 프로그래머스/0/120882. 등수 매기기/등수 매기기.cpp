#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<vector<int>> score) {
    vector<int> answer;
    vector<int> av;
    for(int i= 0; i < score.size(); i++){
        av.push_back((score[i][0]+score[i][1]));
    }
    for(int i=0; i<av.size(); i++){
    	int cnt=1;
        for(int j=0; j<av.size(); j++)
        	if(av[i]<av[j]) cnt++;
        
        answer.push_back(cnt);
    }
    
    return answer;
}