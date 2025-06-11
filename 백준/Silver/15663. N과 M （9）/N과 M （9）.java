
import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[] arr;
    static int[] selected;
    static boolean[] visited;
    static Set<List<Integer>> result = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        selected = new int[m];
        visited = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        backtracking(0);
        List<List<Integer>> sortedResult = new ArrayList<>(result);
        sortedResult.sort((a, b) -> {
            for (int i = 0; i < m; i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });

        for (List<Integer> seq : sortedResult) {
            for (int num : seq) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static void backtracking(int depth) {
        if (depth == m) {
            List<Integer> sequence = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                sequence.add(selected[i]);
            }
            result.add(sequence);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                selected[depth] = arr[i];
                backtracking(depth + 1);
                visited[i] = false;
            }
        }
    }

}
