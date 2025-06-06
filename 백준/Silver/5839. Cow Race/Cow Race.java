import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bessie와 Elsie의 세그먼트 개수 입력
        int N = sc.nextInt(); // Bessie's 세그먼트 개수
        int M = sc.nextInt(); // Elsie's 세그먼트 개수

        // 최대 시간 크기 설정
        final int MAXT = 1001000;
        int[] bspeed = new int[MAXT];
        int[] espeed = new int[MAXT];

        // Bessie's 속도 데이터 입력
        int curt = 0;
        for (int i = 0; i < N; i++) {
            int speed = sc.nextInt();
            int time = sc.nextInt();
            for (int j = 0; j < time; j++) {
                bspeed[curt++] = speed;
            }
        }

        // Elsie's 속도 데이터 입력
        curt = 0;
        for (int i = 0; i < M; i++) {
            int speed = sc.nextInt();
            int time = sc.nextInt();
            for (int j = 0; j < time; j++) {
                espeed[curt++] = speed;
            }
        }

        // 리더십 변경 횟수를 계산
        int ans = 0;
        int leader = 0; // 1: Bessie가 리드, -1: Elsie가 리드, 0: 동점
        int bpos = 0; // Bessie's 누적 거리
        int epos = 0; // Elsie's 누적 거리

        for (int t = 0; t < MAXT; t++) {
            bpos += bspeed[t];
            epos += espeed[t];
            if (bpos > epos) {
                if (leader == -1) { // 이전에 Elsie가 리드했음
                    ans++;
                }
                leader = 1; // 현재 Bessie가 리드
            } else if (epos > bpos) {
                if (leader == 1) { // 이전에 Bessie가 리드했음
                    ans++;
                }
                leader = -1; // 현재 Elsie가 리드
            }
        }

        // 결과 출력
        System.out.println(ans);
        sc.close();
    }
}
