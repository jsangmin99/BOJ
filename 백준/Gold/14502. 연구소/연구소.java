import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[][] map;
    static int[][] temp;
    static int maxSafe = 0;
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        buildWall(0);
        System.out.println(maxSafe);

    }

    static void buildWall(int count) {
        if (count == 3) {
            spreadVirus();
            return;
        }

        for(int i = 0 ; i <n; i++){
            for(int j = 0; j <m;j++){
                if (map[i][j] == 0) {
                    map[i][j] = 1;
                    buildWall(count +1 );
                    map[i][j] = 0;
                }
            }
        }
    }

    static void spreadVirus(){
        temp = new int[n][m];

        for(int i = 0 ; i <n; i++){
            temp[i] = map[i].clone();
        }
        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < m; j++){
                if (temp[i][j] == 2) {
                    queue.add(new int[]{i,j});
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];

            for(int i = 0 ; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (0 <= nx && nx <n && 0 <= ny && ny<m) {
                    if (temp[nx][ny] == 0) {
                        temp[nx][ny] =2;
                        queue.add(new int[]{nx,ny});
                    }
                }
            }
        }
        countSafeArea();
    }

    static void countSafeArea(){
        int safe = 0;
        for(int i = 0 ; i <n; i++){
            for(int j = 0 ; j <m; j++){
                if (temp[i][j] == 0) {
                    safe++;
                }
            }
        }
        maxSafe = Math.max(maxSafe, safe);
    }

}
