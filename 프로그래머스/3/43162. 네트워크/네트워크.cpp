#include <string>
#include <vector>

using namespace std;
int check[200];
void dfs(vector<vector<int>> computers, int n, int current_node){
    check[current_node] = 1;
  	for(int j=0; j<n; j++) { 
    	if(check[j] == 0 && computers[current_node][j] == 1) {   
      		dfs(computers,n,j);
        }
    }   
}

int solution(int n, vector<vector<int>> computers) {
    int answer = 0;
    for(int i =0; i < n; i++){
        if(check[i] == 0){
         	dfs(computers, n, i);
            answer++;
        }
    }
    return answer;
}