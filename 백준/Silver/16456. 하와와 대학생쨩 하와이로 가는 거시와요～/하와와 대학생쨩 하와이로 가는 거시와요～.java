import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int[] dp = new int[50_001];

        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;

        for(int i = 4; i <= n; i++){
            dp[i] = (dp[i-1] + dp[i-3]) % 1_000_000_009;
        }
        System.out.println(dp[n]);
    }
    
}
