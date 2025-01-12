import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 처리
        int N = scanner.nextInt();
        int C = scanner.nextInt();
        int[] houses = new int[N];
        for (int i = 0; i < N; i++) {
            houses[i] = scanner.nextInt();
        }

        // 좌표 정렬
        Arrays.sort(houses);

        // 이진 탐색 초기화
        int left = 1; // 최소 거리
        int right = houses[N - 1] - houses[0]; // 최대 거리
        int answer = 0;

        int case1 = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (canInstall(houses, C, mid)) {
                answer = mid; // 조건을 만족하면 거리 증가
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(answer);
    }

    // 공유기를 설치할 수 있는지 확인하는 함수
    private static boolean canInstall(int[] houses, int C, int distance) {
        int count = 1; // 첫 번째 집에 설치
        int lastInstalled = houses[0];

        for (int i = 1; i < houses.length; i++) {
            if (houses[i] - lastInstalled >= distance) {
                count++;
                lastInstalled = houses[i];
            }
        }

        return count >= C;
    }
}
