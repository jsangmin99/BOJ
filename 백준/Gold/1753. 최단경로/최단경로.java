import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static class Node implements Comparable<Node> {
        int to;
        int weight;

        Node(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int V = Integer.parseInt(st.nextToken()); // 정점의 갯수
        int E = Integer.parseInt(st.nextToken()); // 간선의 갯수
        int start = Integer.parseInt(br.readLine()); // 시작 정점의 번호

        List<List<Node>> graph = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()); // from
            int v = Integer.parseInt(st.nextToken()); // to
            int w = Integer.parseInt(st.nextToken()); // 가중치

            graph.get(u).add(new Node(v, w));
        }

        int dist[] = new int[V + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();

        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node now = pq.poll();
            int cur = now.to;
            int curDist = now.weight;
            if (curDist > dist[cur])
                continue;

            for (Node next : graph.get(cur)) {
                int newDist = dist[cur] + next.weight;
                if (newDist < dist[next.to]) {
                    dist[next.to] = newDist;
                    pq.add(new Node(next.to, newDist));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= V; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                sb.append("INF\n");
            } else {
                sb.append(dist[i]).append("\n");
            }
        }
        System.out.println(sb);

    }

}
