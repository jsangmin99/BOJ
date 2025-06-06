package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 테트로미노 {
    static int n;
    static int m;
    static int[][] map;
    static boolean[][] visited;
    static int max = 0;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                visited[i][j] = true;
                dfs(i, j, map[i][j], 1);
                visited[i][j] = false;
                checkTShape(i, j);
            }
        }
        System.out.println(max);

    }

    private static void checkTShape(int x, int y) {
        if (x >= 0 && y >= 0 && x < n && y < m) {
//            ㅗ
            if (x - 1 >= 0 && y - 1 >= 0 && y + 1 < m)
                max = Math.max(max, map[x][y] + map[x - 1][y] + map[x][y - 1] + map[x][y + 1]);
            // ㅜ
            if (x + 1 < n && y - 1 >= 0 && y + 1 < m)
                max = Math.max(max, map[x][y] + map[x + 1][y] + map[x][y - 1] + map[x][y + 1]);
            // ㅓ
            if (x - 1 >= 0 && x + 1 < n && y - 1 >= 0)
                max = Math.max(max, map[x][y] + map[x - 1][y] + map[x + 1][y] + map[x][y - 1]);
            // ㅏ
            if (x - 1 >= 0 && x + 1 < n && y + 1 < m)
                max = Math.max(max, map[x][y] + map[x - 1][y] + map[x + 1][y] + map[x][y + 1]);
        }
    }

    private static void dfs(int x, int y, int sum, int depth) {
        if (depth == 4) {
            max = Math.max(max, sum);
            return;
        }
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny]) {
                visited[nx][ny] = true;
                dfs(nx, ny, sum + map[nx][ny], depth + 1);
                visited[nx][ny] = false;
            }
        }

    }
}
