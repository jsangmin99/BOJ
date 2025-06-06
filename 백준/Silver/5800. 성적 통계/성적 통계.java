import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine()); // 반의 수

        for (int i = 1; i <= K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken()); // 학생 수
            int[] scores = new int[N];

            for (int j = 0; j < N; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
            }

            // 점수 정렬
            Arrays.sort(scores);

            int max = scores[N - 1];
            int min = scores[0];
            int largestGap = 0;

            // 가장 큰 인접한 점수 차이 계산
            for (int j = 1; j < N; j++) {
                largestGap = Math.max(largestGap, scores[j] - scores[j - 1]);
            }

            // 출력
            System.out.printf("Class %d\n", i);
            System.out.printf("Max %d, Min %d, Largest gap %d\n", max, min, largestGap);
        }
    }

}
