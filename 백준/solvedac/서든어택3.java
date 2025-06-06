package solvedac;

import java.io.*;
import java.util.*;

public class 서든어택3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Long> pq = new PriorityQueue<>();

        st = new StringTokenizer(br.readLine());
        long junwon = Long.parseLong(st.nextToken());
        for (int i = 1; i < n; i++) {
            pq.offer(Long.parseLong(st.nextToken()));
        }

        while (!pq.isEmpty()) {
            long current = pq.poll();
            if (junwon >= current) {
                junwon += current;
            } else {
                bw.write("No\n");
                bw.flush();
                bw.close();
                br.close();
                return;
            }
        }

        bw.write("Yes\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
