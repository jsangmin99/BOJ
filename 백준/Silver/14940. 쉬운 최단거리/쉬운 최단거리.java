import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        int[][] dist = new int[n][m];

        int startX = -1, startY = -1;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 2) {
                    startX = i;
                    startY = j;
                }
                if (map[i][j] == 0) {
                    dist[i][j] = 0;
                } else {
                    dist[i][j] = -1;
                }
            }
        }

        Queue<int[]> queue = new ArrayDeque<>();

//        목표지점2를 시작점으로하여 거리 0 설정
        if (startX != -1) {
            dist[startX][startY] = 0;
            queue.offer(new int[]{startX, startY});
        }
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];

            // 네 방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 지도 범위 벗어나면 스킵
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;

                // 갈 수 있는 땅(1)이고 아직 방문하지 않은 경우
                if (map[nx][ny] == 1 && dist[nx][ny] == -1) {
                    dist[nx][ny] = dist[x][y] + 1; // 현재 거리 +1
                    queue.offer(new int[]{nx, ny});
                }
            }
        }

        // - 갈 수 없는 땅(0)은 0, 도달 불가능한(1인데 방문하지 않은) 곳은 -1, 나머지는 최단거리 값 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(dist[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);

    }
}
