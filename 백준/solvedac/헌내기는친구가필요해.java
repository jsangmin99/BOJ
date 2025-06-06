package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 헌내기는친구가필요해 {
    static char[][] arr;
    static int n;
    static int m;
    static int iPositionX;
    static int iPositionY;
    static int personCount;

    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         iPositionX = 0;
         iPositionY = 0;

         n = Integer.parseInt(st.nextToken());
         m = Integer.parseInt(st.nextToken());


        arr = new char[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j);
                if (arr[i][j] == 'I') {
                    iPositionX = i;
                    iPositionY = j;
                }
            }
        }
        visited = new boolean[n][m];

        dfs(iPositionX, iPositionY);

        System.out.println(personCount > 0 ? personCount : "TT");

    }
    static void dfs(int x, int y) {
        visited[x][y] = true; // 현재 위치 방문 처리

        if (arr[x][y] == 'P') {
            personCount++;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= n || ny < 0 || ny >= m || visited[nx][ny] || arr[nx][ny] == 'X') {
                continue;
            }

            dfs(nx, ny);
        }
    }


}
