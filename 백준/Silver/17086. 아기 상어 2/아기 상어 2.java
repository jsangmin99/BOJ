import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] dx = {0, 0, 1, -1, 1, 1, -1, -1};
        int[] dy = {1, -1, 0, 0, 1, -1, 1, -1};
        int n, m;
        int[][] map;
        int[][] dist;
        Queue<int[]> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n][m];
        dist = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                map[i][j] = sc.nextInt();
                if(map[i][j] == 1){
                    queue.add(new int[]{i, j});
                }
            }
        }

        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            int x = temp[0];
            int y = temp[1];
            for(int i = 0; i < 8; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < m){
                    if(map[nx][ny] == 0){
                        map[nx][ny] = 1;
                        dist[nx][ny] = dist[x][y] + 1;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
        int answer = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                answer = Math.max(answer, dist[i][j]);
            }
        }
        System.out.println(answer);
    }
}
