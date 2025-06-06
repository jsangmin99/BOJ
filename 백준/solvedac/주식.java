package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 주식 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n;
        int[] arr;

        for (int i = 0; i < T; i++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n];
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            long max = 0;
            int nowMax = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (arr[j] > nowMax) {
                    nowMax = arr[j];
                }else {
                    max += (nowMax - arr[j]);
                }
            }

            sb.append(max).append("\n");
        }
        System.out.println(sb);

    }
}
