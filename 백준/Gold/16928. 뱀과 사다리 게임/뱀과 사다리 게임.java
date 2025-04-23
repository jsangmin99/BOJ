import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws  IOException{
        int[] map = new int[101];
        for (int i = 0; i < 101; i++) {
            map[i] = i;
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sadariN = Integer.parseInt(st.nextToken());
        int snakeN = Integer.parseInt(st.nextToken());

        for (int i = 0; i < sadariN + snakeN; i++) {
            st = new StringTokenizer(br.readLine());
            int startPoint = Integer.parseInt(st.nextToken());
            int endPoint = Integer.parseInt(st.nextToken());
            map[startPoint] = endPoint;
        }

//        BFS
        boolean[] visited = new boolean[101];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{1, 0}); //시작지점,주사위 횟수
        visited[1] = true;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int nowPosition = current[0];
            int cnt = current[1];

//            종료조건 = 도착
            if (nowPosition == 100) {
                System.out.println(cnt);
                return;
            }

            for (int dice = 1; dice <= 6; dice++) {
                int next = nowPosition + dice;

                if (next > 100) continue;

                next = map[next];
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(new int[]{next, cnt + 1});
                }
            }
        }

    }
}
