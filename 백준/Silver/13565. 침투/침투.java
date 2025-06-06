import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[] dx = { -1, 1, 0, 0 }; // 상하좌우 방향
    static int[] dy = { 0, 0, -1, 1 };
    static boolean[][] visited;
    static boolean check = false;
    static int[][] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken()); // 행의 크기
        n = Integer.parseInt(st.nextToken()); // 열의 크기

        arr = new int[m][n];
        visited = new boolean[m][n];

        // 배열 입력
        for (int i = 0; i < m; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }

        // 첫 번째 행의 흰색 칸(0)에서 DFS 시작
        for (int j = 0; j < n; j++) { // 열 크기 기준으로 탐색
            if (arr[0][j] == 0 && !visited[0][j]) {
                dfs(0, j);
            }
        }

        // 결과 출력
        System.out.println(check ? "YES" : "NO");
    }

    static void dfs(int x, int y) {
        if (check) return; // 이미 침투 성공 확인된 경우 종료

        visited[x][y] = true;

        // 마지막 행 도달 시 침투 성공
        if (x == m - 1) {
            check = true;
            return;
        }

        // 상하좌우 탐색
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 유효한 좌표 & 조건 만족 시 DFS 재귀 호출
            if (nx >= 0 && nx < m && ny >= 0 && ny < n && !visited[nx][ny] && arr[nx][ny] == 0) {
                dfs(nx, ny);
            }
        }
    }
}
