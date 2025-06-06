import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        boolean[] visited = new boolean[10];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[][] skip = new int[10][10];
        skip[1][3] = skip[3][1] = 2;
        skip[1][7] = skip[7][1] = 4;
        skip[3][9] = skip[9][3] = 6;
        skip[7][9] = skip[9][7] = 8;
        skip[1][9] = skip[9][1] = 5;
        skip[3][7] = skip[7][3] = 5;
        skip[2][8] = skip[8][2] = 5;
        skip[4][6] = skip[6][4] = 5;

        for (int i = 0; i < n; i++) {
            int current = arr[i];
            if (visited[current]) {
                System.out.println("NO");
                return;
            }
            if (i > 0) {
                int prev = arr[i - 1];
                int mid = skip[prev][current];
                if (mid != 0 && !visited[mid]) {
                    System.out.println("NO");
                    return;
                }
            }
            visited[current] = true;
        }
        System.out.println("YES");
    }
}
