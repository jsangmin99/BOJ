package solvedac;

import java.io.*;
import java.util.*;

public class 케빈베이컨의6단계법칙 {
    static int n, m;
    static List<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        // 그래프 초기화 (1부터 n까지)
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 친구 관계 입력
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        // 최소 케빈 베이컨 수를 가진 사람 찾기
        int minBacon = Integer.MAX_VALUE;
        int minPerson = -1;

        for (int i = 1; i <= n; i++) {
            int sum = bfs(i);
            if (sum < minBacon) {
                minBacon = sum;
                minPerson = i;
            } else if (sum == minBacon && i < minPerson) {
                minPerson = i;
            }
        }

        System.out.println(minPerson);
    }

    private static int bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1); // 방문 여부 초기화
        dist[start] = 0; // 시작점 거리 0
        queue.add(start);
        int sum = 0;

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int next : graph[cur]) {
                if (dist[next] == -1) { // 방문하지 않은 경우
                    dist[next] = dist[cur] + 1;
                    sum += dist[next];
                    queue.add(next);
                }
            }
        }
        return sum;
    }
}
