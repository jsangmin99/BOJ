import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 가로 크기
        int M = scanner.nextInt(); // 세로 크기
        scanner.close();

        // 나선형 경로의 끝 지점 찾기
        int[] result = findSpiralEnd(N, M);

        // 결과 출력
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] findSpiralEnd(int N, int M) {
        // 방향: 동(0), 북(1), 서(2), 남(3)
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        // 맵 초기화 (false: 미방문, true: 방문)
        boolean[][] visited = new boolean[M][N];

        // 시작 위치 (남서쪽 모서리)
        int x = 0, y = 0;
        int direction = 0;  // 처음에는 동쪽으로 이동

        // 시작 위치 방문 표시
        visited[y][x] = true;

        while (true) {
            // 다음 위치 계산
            int nx = x + dx[direction];
            int ny = y + dy[direction];

            // 다음 위치가 범위를 벗어나거나 이미 방문한 경우
            if (nx < 0 || nx >= N || ny < 0 || ny >= M || visited[ny][nx]) {
                // 방향 전환 (왼쪽으로 90도)
                direction = (direction + 1) % 4;
                nx = x + dx[direction];
                ny = y + dy[direction];

                // 다음 위치가 여전히 벽이거나 방문한 경우 -> 더 이상 갈 곳이 없음
                if (nx < 0 || nx >= N || ny < 0 || ny >= M || visited[ny][nx]) {
                    // 현재 위치가 마지막 위치
                    return new int[]{x, y};
                }
            }

            // 이동 및 방문 표시
            x = nx;
            y = ny;
            visited[y][x] = true;
        }
    }
}