import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 친구수
        int m = Integer.parseInt(br.readLine()); // 게임횟수
        int[] targets = new int[m];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            targets[i] = Integer.parseInt(st.nextToken());
        }

        int[] result = new int[n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int wrongCount = 0;
            for (int j = 0; j < n; j++) {
                int guess = Integer.parseInt(st.nextToken()) - 1;
                if (targets[i] - 1 == j) {
                    result[j]++;
                } else {
                    if (guess == targets[i] - 1) {
                        result[j]++;
                    } else {
                        wrongCount++;
                    }
                }
            }
            result[targets[i] - 1] += wrongCount;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }

    }

}
