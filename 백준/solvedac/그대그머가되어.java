package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 그대그머가되어 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int first = Integer.parseInt(st.nextToken());
        int last = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            arr.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr.get(a).add(b);
            arr.get(b).add(a);
        }

        Queue<Integer> queue = new LinkedList<>();
        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1);

        queue.add(first);
        dist[first] = 0;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int next : arr.get(current)) {
                if (dist[next] == -1) {
                    dist[next] = dist[current] + 1;
                    queue.add(next);
                }
            }
        }
        System.out.println(dist[last]);

    }
}
