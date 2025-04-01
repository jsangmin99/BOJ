import java.util.*;

class Solution {
    public int solution(String[] storage, String[] requests) {
        int n = storage.length;
        int m = storage[0].length();
        
        char[][] grid = new char[n + 2][m + 2];
        
        for (int i = 0; i < n + 2; i++) {
            Arrays.fill(grid[i], '.');
        }
        
        int totalContainers = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                char ch = storage[i - 1].charAt(j - 1);
                grid[i][j] = ch;
                if (ch != '.') {
                    totalContainers++;
                }
            }
        }

        int answer = totalContainers;
        Set<Character> removedSet = new HashSet<>(); 

        for (String req : requests) {
            char target = req.charAt(0);
            if (removedSet.contains(target)) {
                continue;
            }
            if (req.length() == 1) {
                boolean[][] visited = new boolean[n + 2][m + 2];
                Queue<int[]> q = new LinkedList<>();
                q.offer(new int[] {0, 0});
                visited[0][0] = true;
                int[] dr = {-1, 1, 0, 0};
                int[] dc = {0, 0, -1, 1};
                while (!q.isEmpty()) {
                    int[] cur = q.poll();
                    int r = cur[0], c = cur[1];
                    for (int k = 0; k < 4; k++) {
                        int nr = r + dr[k];
                        int nc = c + dc[k];
                        if (nr < 0 || nr >= n+2 || nc < 0 || nc >= m+2) continue;
                        if (visited[nr][nc]) continue;
                        visited[nr][nc] = true;
                        if (grid[nr][nc] == target) {
                            grid[nr][nc] = '.';
                            answer--;
                        } else if (grid[nr][nc] == '.') {
                            q.offer(new int[] {nr, nc});
                        }

                    }
                }
            } else {

                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= m; j++) {
                        if (grid[i][j] == target) {
                            grid[i][j] = '.';
                            answer--;
                        }
                    }
                }
                removedSet.add(target);
            }
        }

        return answer;
    }
}
