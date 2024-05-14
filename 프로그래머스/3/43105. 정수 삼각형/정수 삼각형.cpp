#include <string>
#include <vector>

using namespace std;

int solution(vector<vector<int>> triangle) {
    int answer = 0;
    int sum = 0;
    /*
    7
    38
    810
    2744
    45265
    */
  
    int dp[500][500];
    int n = triangle.size();
    dp[0][0] = triangle[0][0];
    for(int i = 1; i<n; i++){
        for(int j = 0; j<=i; j++){
            if(j==0) 
                dp[i][j] = dp[i-1][0] + triangle[i][j];
            else if(j==i) 
                dp[i][j] = dp[i-1][i-1] + triangle[i][j];
            else{
                dp[i][j] = max(dp[i-1][j-1], dp[i-1][j]) + triangle[i][j];
            }
        }
    }
    for(int i = 0; i < n;i++){
        if(answer < dp[n-1][i]) answer = dp[n-1][i];
    }
    return answer;
}