import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = { -2, -1, 1, 2, 2, 1, -1, -2 };
    static int[] dy = { 1, 2, 2, 1, -1, -2, -2, -1 };

    static class Point {
        int x, y, cnt;

        Point(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int nightX = Integer.parseInt(st.nextToken());
            int nightY = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            int[][] map = new int[n][n];
            boolean[][] visited = new boolean[n][n];
            Queue<Point> queue = new LinkedList<>();
            queue.offer(new Point(nightX, nightY, 0));
            visited[nightX][nightY] = true;
            int result = 0;
            while (!queue.isEmpty()) {
                Point cur = queue.poll();
                if (cur.x == endX && cur.y == endY) {
                    result = cur.cnt;
                    break;
                }

                for (int i = 0; i < 8; i++) {
                    int nx = cur.x + dx[i];
                    int ny = cur.y + dy[i];

                    if (nx >= 0 && ny >= 0 && nx < n && ny < n && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.offer(new Point(nx, ny, cur.cnt + 1));
                    }
                }
            }

            System.out.println( result);

        }
    }

}
