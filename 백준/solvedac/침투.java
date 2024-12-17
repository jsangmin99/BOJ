package solvedac;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 침투 {
    static int n, m;
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };
    static boolean[][] visited;
    static boolean check = false;
    static int[][] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        arr = new int[m][n];
        visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }

        for (int j = 0; j < n; j++) {
            if (arr[0][j] == 0 && !visited[0][j]) {
                dfs(0, j);
            }
        }
        System.out.println(check ? "YES" : "NO");
    }

    static void dfs(int x, int y) {
        if (check)
            return;

        visited[x][y] = true;

        // 밑에 도착한경우
        if (x == m - 1) {
            check = true;
            return;
        }

        // 상하좌우 탐색
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < m && ny >= 0 && ny < n && !visited[nx][ny] && arr[nx][ny] == 0) {
                dfs(nx, ny);

            }
        }
    }

}
