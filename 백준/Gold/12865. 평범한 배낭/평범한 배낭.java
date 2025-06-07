import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 물품의 수
        int k = Integer.parseInt(st.nextToken()); // 버틸수 있는 무게

        int[][] object = new int[n][2]; // 무게 : 가치

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            object[i][0] = Integer.parseInt(st.nextToken()); // 무게
            object[i][1] = Integer.parseInt(st.nextToken()); // 가치
        }

        int[] dp = new int[k + 1];

        for (int i = 0; i < n; i++) {
            int weight = object[i][0];
            int value = object[i][1];
            for (int w = k; w >= weight; w--) {
                dp[w] = Math.max(dp[w], dp[w - weight] + value);
            }
        }
        System.out.println(dp[k]);
    }

}
