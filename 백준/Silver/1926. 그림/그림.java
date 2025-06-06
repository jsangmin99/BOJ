import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[][] map;
    static boolean[][] visited;
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};

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

        int pictureCount = 0;
        int maxArea = 0;

//        BFS 를 통해 순회

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
//                방문하지 않았고 그림이 있으면 BFS 실행
                if (!visited[i][j] && map[i][j] == 1) {
                    pictureCount++;
                    maxArea = Math.max(maxArea, bfs(i, j));
                }
            }
        }
        System.out.println(pictureCount);
        System.out.println(maxArea);

    }

    static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;

//        현재 그림의 넓이
        int nowArea = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            nowArea++; // 현재칸 포함

//            사방탐색
            for (int i = 0; i < 4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];

//                도화지 안에 있고 방문하지 않았으며 그림인 경우
                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (!visited[nx][ny] && map[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
        return nowArea;
    }

}