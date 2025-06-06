import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static int[][] map;
    static List<int[]> villages;
    static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        map = new int[N][M];
        villages = new ArrayList<>();
        
        // 맵 정보 입력 및 마을 위치 저장
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
                if (map[i][j] == 1) {
                    villages.add(new int[]{i, j});
                }
            }
        }
        
        // 두 독주머니를 놓을 위치를 테스트하면서 최소 시간을 찾음
        System.out.println(findMinSpreadTime());
    }
    
    static int findMinSpreadTime() {
        int minTime = Integer.MAX_VALUE;
        
        // 모든 빈 공간에 대해 두 독주머니를 놓을 경우를 계산
        for (int x1 = 0; x1 < N; x1++) {
            for (int y1 = 0; y1 < M; y1++) {
                // 첫 번째 독주머니는 빈 공간이어야 함
                if (map[x1][y1] != 0) continue;
                
                for (int x2 = 0; x2 < N; x2++) {
                    for (int y2 = 0; y2 < M; y2++) {
                        // 두 번째 독주머니는 다른 빈 공간이어야 함
                        if (map[x2][y2] != 0 || (x1 == x2 && y1 == y2)) continue;
                        
                        // 두 독주머니를 놓은 경우에 대한 퍼짐 시간 계산
                        int currentTime = calculateSpreadTime(x1, y1, x2, y2);
                        minTime = Math.min(minTime, currentTime);
                    }
                }
            }
        }
        
        return minTime == Integer.MAX_VALUE ? -1 : minTime; // 마을에 도달할 수 없다면 -1 반환
    }
    
    static int calculateSpreadTime(int x1, int y1, int x2, int y2) {
        // 두 독주머니에서 각각 BFS를 통해 퍼지는 시간을 계산
        int[][] dist1 = bfs(x1, y1);
        int[][] dist2 = bfs(x2, y2);
        
        // 각 마을에 대해 두 독주머니 중 더 빨리 도달한 시간을 구하고, 가장 긴 시간을 찾음
        int maxTime = 0;
        for (int[] village : villages) {
            // 두 독주머니 중 더 빨리 도달한 시간 계산
            int villageTime = Math.min(dist1[village[0]][village[1]], dist2[village[0]][village[1]]);
            maxTime = Math.max(maxTime, villageTime);
        }
        
        return maxTime;
    }
    
    static int[][] bfs(int startX, int startY) {
        int[][] distances = new int[N][M];
        for (int[] row : distances) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY});
        distances[startX][startY] = 0;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1];
            
            for (int[] dir : directions) {
                int nx = x + dir[0];
                int ny = y + dir[1];
                
                // 범위 내에서, 이미 방문하지 않은 곳에 대해 거리를 갱신하고 큐에 추가
                if (nx >= 0 && nx < N && ny >= 0 && ny < M && distances[nx][ny] == Integer.MAX_VALUE) {
                    distances[nx][ny] = distances[x][y] + 1;
                    queue.offer(new int[]{nx, ny});
                }
            }
        }
        
        return distances;
    }
}
