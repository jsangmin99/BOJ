import java.util.*;
class Solution {
    static int[] dx = new int[]{-1, 1, 0, 0};
    static int[] dy = new int[]{0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length;
        boolean visited[][] = new boolean[n][m];
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{0, 0, 1}); // x, y, distance
        visited[0][0] = true;
        
        while(!que.isEmpty()){
            int[] now = que.poll();
            int x = now[0];
            int y = now[1];
            int dist = now[2];
            
            for(int i = 0 ; i< 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                // 목적지에 도달하면 종료
                if (x == n - 1 && y == m - 1) {
                    return dist;
                }
            
                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if(maps[nx][ny] == 1 && !visited[nx][ny]){
                        visited[nx][ny] = true;
                        que.offer(new int[] {nx, ny, dist+1});
                    }
                }
            }
        }
        return -1;
    }
}