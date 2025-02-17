import java.util.*;
import java.io.*;
public class Main {
    static int[][] arr;
    static int n , m;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken()); // 가로칸
        n = Integer.parseInt(st.nextToken()); // 새로칸
        arr = new int[n][m];
        Queue<int[]> queue = new LinkedList<>();

//        1 = 익은 토마토 , 0 = 익지 않은 토마토, -1 = 빈공간
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        int day = bfs(queue);

        if (checkAll()) {
            System.out.println(day);
        } else {
            System.out.println(-1);
        }
    }

    static int bfs(Queue<int[]> queue) {
        int day = -1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            day++;

            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];

                for (int j = 0; j < 4; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];

                    if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 0) {
                        arr[nx][ny] = 1;
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
        }
        return day;
    }

    static boolean checkAll() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    return false;
                }

            }
        }
        return true;
    }
}
