import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean[][] visited;
    static int n;
    static char[][] arr;
    static int[] dx = {0, 0, -1, 1}; // 상하좌우 이동
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new char[n][n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().toCharArray();
        }
        visited = new boolean[n][n];

        int normalCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, arr[i][j], false);
                    normalCount++;
                }
            }
        }

//        적록 색약인 경우
        visited = new boolean[n][n];
        int blindCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, arr[i][j], true);
                    blindCount++;
                }

            }
        }
        System.out.println(normalCount + " " + blindCount);


    }

    private static void dfs(int x, int y, char color, boolean isBlind) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < n && !visited[nx][ny]) {
                if (isBlind) {
                    if ((color == 'R' || color == 'G') && (arr[nx][ny] == 'R' ||arr[nx][ny] == 'G')) {
                        dfs(nx, ny, color, true);
                    } else if (arr[nx][ny] == color) {
                        dfs(nx, ny, color, true);
                    }
                }else {
                    if (arr[nx][ny] == color) {
                        dfs(nx, ny, color, false);
                    }
                }
            }
        }
    }


}
