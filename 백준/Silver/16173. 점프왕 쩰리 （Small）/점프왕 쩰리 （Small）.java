import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        // BFS로 탐색
        if (canReachEnd(n, grid)) {
            System.out.println("HaruHaru");
        } else {
            System.out.println("Hing");
        }
    }

    private static boolean canReachEnd(int n, int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        
        // 시작점 추가
        queue.add(new int[] { 0, 0 });
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            // 현재 칸의 값
            int step = grid[x][y];

            // 승리 지점에 도달했는지 확인
            if (step == -1) {
                return true;
            }

            // 이동 가능한 방향: 오른쪽, 아래
            int[][] directions = { { 0, step }, { step, 0 } };

            for (int[] dir : directions) {
                int nx = x + dir[0];
                int ny = y + dir[1];

                // 범위 확인 및 방문 여부 확인
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new int[] { nx, ny });
                }
            }
        }

        // BFS 종료 후에도 승리 지점에 도달하지 못하면 false 반환
        return false;
    }
}
