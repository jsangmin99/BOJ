package solvedac;

import java.util.*;

public class 쓰레기수거 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 테스트 케이스 개수 입력
        int T = scanner.nextInt();

        while (T-- > 0) {
            // 용량과 지점의 개수 입력
            int W = scanner.nextInt();
            int N = scanner.nextInt();

            int currentLoad = 0; // 현재 쓰레기차의 적재량
            int totalDistance = 0; // 총 이동 거리
            int lastX = 0; // 마지막 지점의 거리

            for (int i = 0; i < N; i++) {
                int x = scanner.nextInt(); // 지점의 거리
                int w = scanner.nextInt(); // 지점의 쓰레기 양

                // 적재량에 쓰레기를 추가
                currentLoad += w;

                // 용량을 초과했을 때 처리
                if (currentLoad > W) {
                    totalDistance += lastX * 2; // 현재까지의 왕복 거리 추가
                    currentLoad = w; // 새로운 적재량으로 초기화
                }

                // 용량이 딱 맞을 때 처리
                if (currentLoad == W) {
                    totalDistance += x * 2; // 현재 위치 왕복 거리 추가
                    currentLoad = 0; // 적재량 초기화
                }

                lastX = x; // 마지막 지점 거리 갱신
            }

            // 마지막 남은 쓰레기를 처리
            if (currentLoad > 0) {
                totalDistance += lastX * 2; // 마지막 지점 왕복 거리 추가
            }

            // 결과 출력
            System.out.println(totalDistance);
        }

        scanner.close();
    }
}
