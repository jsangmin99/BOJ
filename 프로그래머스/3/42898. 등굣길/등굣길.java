class Solution {
    public int solution(int m, int n, int[][] puddles) {
         int answer = 0;
            int[][] dp = new int[n][m];
            dp[0][0] = 1;
            for (int[] puddle : puddles) {
                dp[puddle[1] - 1][puddle[0] - 1] = -1;
            }
            for (int i = 0; i <n; i++){
                for(int j = 0; j < m; j++){
                    if(dp[i][j] == -1){ //웅덩이
                        dp[i][j] = 0; // 0으로 초기화 왜냐면 가로로 가니까
                        continue;
                    }
                    if(i != 0){ //위에서 내려오는 경우
                        dp[i][j] += dp[i-1][j] % 1000000007;
                    }
                    if(j != 0){ //왼쪽에서 오는 경우
                        dp[i][j] += dp[i][j-1] % 1000000007;
                    }
                }
            }
            answer = dp[n-1][m-1] % 1000000007;

            return answer;
    }
}