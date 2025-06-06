import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 알고리즘수업_깊이우선탐색3 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] depth;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        depth = new int[N + 1];
        Arrays.fill(depth, -1);

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            graph[first].add(second);
            graph[second].add(first);

        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }
        dfs(R, 0);

        for (int i = 1; i <= N; i++) {
            System.out.println(depth[i]);
        }

    }

    static void dfs(int node, int d) {
        visited[node] = true;
        depth[node] = d;

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next, d + 1);
            }
        }
    }
}
