import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] count = new int[11];
        for (int i = 1; i <= 10; i++)
            count[i] = 2;
        count[a]--;
        count[b]--;

        int winCount = 0;
        int total = 0;

        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= 10; j++) {
                if (i == j) {
                    if (count[i] >= 2) {
                        count[i] -= 2;
                        total++; // (i, i) 조합은 1가지
                        if (compare(a, b, i, j) > 0)
                            winCount++;
                        count[i] += 2;
                    }
                } else {
                    int pairCount = count[i] * count[j]; // 가능한 모든 (i, j), (j, i)쌍 개수
                    if (pairCount > 0) {
                        count[i]--;
                        count[j]--;
                        total += pairCount;
                        if (compare(a, b, i, j) > 0)
                            winCount += pairCount;
                        count[i]++;
                        count[j]++;
                    }
                }
            }
        }

        double result = (double) winCount / total;
        System.out.printf("%.3f\n", result);
    }

    static int compare(int a1, int a2, int b1, int b2) {
        return getRank(a1, a2) - getRank(b1, b2);
    }

    static int getRank(int x, int y) {
        return x == y ? 100 + x : (x + y) % 10;
    }
}
