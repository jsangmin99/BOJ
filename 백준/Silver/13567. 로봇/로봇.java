import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int n; // 로봇이 수행할 명령어 개수
    static int m; // 정사각형 크기 (M * M)
    static int x = 0, y = 0; // 로봇의 현재 위치 (0, 0)에서 시작
    static int direction = 0; // 로봇의 초기 방향 (0: 동, 1: 북, 2: 서, 3: 남)
    static int[] dx = {1, 0, -1, 0}; // 동북서남 방향 (x축 변화)
    static int[] dy = {0, 1, 0, -1}; // 동북서남 방향 (y축 변화)

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        // 첫 번째 줄 입력 받기 (M, n)
        String[] input = br.readLine().trim().split(" ");
        m = Integer.parseInt(input[0]); // 정사각형 크기
        n = Integer.parseInt(input[1]); // 명령어 개수

        // 명령어 처리
        for (int i = 0; i < n; i++) {
            // 각 명령어 입력 받기
            String[] command = br.readLine().trim().split(" ");
            if (command[0].equals("TURN")) {
                int dir = Integer.parseInt(command[1]);
                turn(dir); // 회전 명령 처리
            } else if (command[0].equals("MOVE")) {
                int d = Integer.parseInt(command[1]);
                if (!move(d)) { // 이동 명령 처리
                    System.out.println(-1); // 범위를 벗어나면 -1 출력
                    return; // 프로그램 종료
                }
            }
        }

        // 명령어 수행 후 최종 위치 출력
        System.out.println(x + " " + y);
    }

    // 회전 명령 처리
    private static void turn(int dir) {
        if (dir == 0) {
            // 왼쪽 회전: 반시계방향으로 90도 회전
            direction = (direction + 1) % 4; // (현재 방향 + 1) % 4 로 왼쪽 회전
        } else {
            // 오른쪽 회전: 시계방향으로 90도 회전
            direction = (direction + 3) % 4; // (현재 방향 + 3) % 4 로 오른쪽 회전
        }
    }

    // 이동 명령 처리
    private static boolean move(int d) {
        // 이동하려는 좌표 계산
        int newX = x + dx[direction] * d;
        int newY = y + dy[direction] * d;

        // 새로운 좌표가 범위를 벗어나면 false 반환
        if (newX < 0 || newX >= m || newY < 0 || newY >= m) {
            return false; // 범위를 벗어나면 false 반환
        }

        // 범위 내에서 이동
        x = newX;
        y = newY;
        return true; // 범위 내에서 이동 성공
    }
}
