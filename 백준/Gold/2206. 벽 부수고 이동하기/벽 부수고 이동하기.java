import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static class Point {
        int x, y, dist, broken;

        public Point(int x, int y, int dist, int broken) {
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.broken = broken;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        boolean[][][] visited = new boolean[n][m][2];
        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(0, 0, 1, 0));
        visited[0][0][0] = true;

        while (!queue.isEmpty()) {
            Point p = queue.poll();

            if (p.x == n - 1 && p.y == m - 1) {
                System.out.println(p.dist);
                return;
            }

            for (int d = 0; d < 4; d++) {
                int nx = p.x + dx[d];
                int ny = p.y + dy[d];
                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {

                    // 다음칸이 벽이 아닐경우
                    if (map[nx][ny] == 0 && !visited[nx][ny][p.broken]) {
                        visited[nx][ny][p.broken] = true;
                        queue.offer(new Point(nx, ny, p.dist + 1, p.broken));
                    } 
                    // 다음칸이 벽일경우
                    else if (map[nx][ny] == 1 && p.broken == 0 && !visited[nx][ny][1]) {
                        visited[nx][ny][1] = true;
                        queue.offer(new Point(nx, ny, p.dist + 1, 1));
                    }

                }
            }

        }
        System.out.println(-1);

    }

}
