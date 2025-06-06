import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static boolean[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        map = new boolean[n][m];
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            map[a][b] = true;
        }

        visited = new boolean[n][m];
        int maxSize = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] && !visited[i][j]) {
                    int size = dfs(i, j);
                    maxSize = Math.max(maxSize, size);
                }
            }
        }
        System.out.println(maxSize);
    }

    static int dfs(int x, int y) {
        visited[x][y] = true;
        int size = 1;
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if (nextX >= 0 && nextY >= 0 && nextX < n && nextY < m) {
                if (map[nextX][nextY] && !visited[nextX][nextY]) {
                    size += dfs(nextX, nextY);
                }
            }
        }
        return size;
    }
}
