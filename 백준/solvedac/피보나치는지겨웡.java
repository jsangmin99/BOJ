package solvedac;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 피보나치는지겨웡 {
    public static void main(String[] args) throws IOException {
        // 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // dp 배열 초기화
        int[] dp = new int[n + 1];
        dp[0] = 1;
        if (n > 0) {
            dp[1] = 1;
        }

        // 동적 계획법을 이용해 dp 배열 채우기
        for (int i = 2; i <= n; i++) {
            dp[i] = (1 + dp[i - 1] + dp[i - 2]) % 1000000007;
        }

        // 결과 출력
        System.out.println(dp[n]);
    }
}
