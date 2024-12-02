#include <iostream>
#define MAX 100001

using namespace std;

int T, N;
int sticker[2][MAX];
int dp[2][MAX];

int main(){
    cin >> T;

    for(int i = 0; i < T; i++){
        cin >> N;
        
        for(int j=0;j<N;j++)
            cin >> sticker[0][j];
        for(int j=0;j<N;j++)
            cin >> sticker[1][j];
        
        dp[0][0] = sticker[0][0];
        dp[1][0] = sticker[1][0]; 
        dp[0][1] = sticker[0][1]+dp[1][0];
        dp[1][1] = sticker[1][1]+dp[0][0];

        for(int j = 2 ; j < N; j++){
            dp[0][j] = sticker[0][j] + max(dp[1][j-1], dp[1][j-2]); // dp[0][j] 계산 시 dp[1][j-1]과 dp[1][j-2] 사용
            dp[1][j] = sticker[1][j] + max(dp[0][j-1], dp[0][j-2]); // dp[1][j] 계산 시 dp[0][j-1]과 dp[0][j-2] 사용
}
        cout << max(dp[0][N-1],dp[1][N-1]) << "\n";
    }
}