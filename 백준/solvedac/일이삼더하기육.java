import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 일이삼더하기육 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        long[] dp  = new long[100_001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 2;
        dp[4] = 3;
        dp[5] = 3;
        dp[6] = 6;

        for(int i = 7; i <= 100_000; i++){
            dp[i] = (dp[i-2] + dp[i-4] + dp[i-6]) % 1_000_000_009;
        }

        StringBuilder sb =new StringBuilder();
        for(int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[n] + "\n");
        }
        System.out.println(sb);
    }
    
}
