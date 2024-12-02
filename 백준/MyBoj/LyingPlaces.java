package MyBoj;
import java.util.Scanner;

public class LyingPlaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 방의 크기 N 입력
        int N = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        // 방 구조 입력
        char[][] room = new char[N][N];
        for (int i = 0; i < N; i++) {
            room[i] = sc.nextLine().toCharArray();
        }

        int horizontal = 0; // 가로로 누울 수 있는 자리 수
        int vertical = 0;   // 세로로 누울 수 있는 자리 수

        // 가로로 누울 수 있는 자리 찾기
        for (int i = 0; i < N; i++) {
            int count = 0; // 연속된 빈칸 수
            for (int j = 0; j < N; j++) {
                if (room[i][j] == '.') {
                    count++;
                } else {
                    if (count >= 2) horizontal++;
                    count = 0;
                }
            }
            if (count >= 2) horizontal++;
        }

        // 세로로 누울 수 있는 자리 찾기
        for (int j = 0; j < N; j++) {
            int count = 0; // 연속된 빈칸 수
            for (int i = 0; i < N; i++) {
                if (room[i][j] == '.') {
                    count++;
                } else {
                    if (count >= 2) vertical++;
                    count = 0;
                }
            }
            if (count >= 2) vertical++;
        }

        // 결과 출력
        System.out.println(horizontal + " " + vertical);
    }
}
