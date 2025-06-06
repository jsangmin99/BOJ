import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Queue<Point> queue = new LinkedList<>();

        queue.offer(new Point(0, 0, 0));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Point cur = queue.poll();
            int boost = map[cur.row][cur.column];
            
            // 도착지점에 도달
            if (cur.row == n - 1 && cur.column == m - 1) {
                System.out.println(cur.cnt);
                return;
            }

            // 아래로이동
            for (int i = 1; i <= boost; i++) {
                int nextRow = cur.row + i;
                if (nextRow >= n)
                    break;
                if (!visited[nextRow][cur.column]) {
                    visited[nextRow][cur.column] = true;
                    queue.offer(new Point(nextRow, cur.column, cur.cnt + 1));
                }
            }

            // 오른쪽으로 이동
            for (int i = 1; i <= boost; i++) {
                int nextCol = cur.column + i;
                if (nextCol >= m)
                    break;
                if (!visited[cur.row][nextCol]) {
                    visited[cur.row][nextCol] = true;
                    queue.offer(new Point(cur.row, nextCol, cur.cnt + 1));
                }
            }
        }
        System.out.println(-1);
    }

    static class Point {
        int row, column, cnt;

        public Point(int row, int column, int cnt) {
            this.row = row;
            this.column = column;
            this.cnt = cnt;
        }
    }

}
