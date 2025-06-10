import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int[] result = new int[m];
        boolean[] visited = new boolean[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();

        backtracking(0, n, m, arr, result, visited, sb);

        System.out.println(sb.toString());
    }

    static void backtracking(int depth, int n, int m, int[] numbers, int[] result, boolean[] visited,
            StringBuilder sb) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(result[i]);
                if (i < m - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = numbers[i];
                backtracking(depth + 1, n, m, numbers, result, visited, sb);
                visited[i] = false;
            }
        }

    }

}
