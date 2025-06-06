import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[] dx = { 0, 0, -1, 1 };
    static int[] dy = { 1, -1, 0, 0 };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        int result = bfs(map, n, m);
        System.out.println(result);

    }

    public static int bfs(int[][] map, int n, int m) {
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[] { 0, 0 });
        visited[0][0] = true;

        int[][] distance = new int[n][m];
        distance[0][0] = 1;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            // 현재위치에서 상하좌우 검색
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 미로 범위를 벗어나지 않고, 이동 가능한 칸이며, 방문하지 않은 경우
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && map[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.add(new int[] { nx, ny });
                    visited[nx][ny] = true;
                    distance[nx][ny] = distance[x][y] + 1;
                }
            }
        }
        return distance[n - 1][m - 1];
    }

}
