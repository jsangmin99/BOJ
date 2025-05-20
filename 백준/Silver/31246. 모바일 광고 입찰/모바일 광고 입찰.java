import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 전체 분석 대상 광고 지면의 수
        int k = Integer.parseInt(st.nextToken()); // 목표낙찰 지면의 수

        // a = 제시한 입찰가격
        // b = 모든 입찰가중 최고가격
        int min = 0;
        int A[] = new int[n];
        int B[] = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            A[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());
        }

        long left = 0, right = 1_000_000_000;
        long answer = right;

        while (left <= right) {
            long mid = (left + right) / 2;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (A[i] + mid >= B[i]) {
                    count++;
                }
            }

            if (count >= k) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(answer);

    }

}
