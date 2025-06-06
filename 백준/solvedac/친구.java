package solvedac;

import java.util.Scanner;

public class 친구 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 입력받기: 사람 수 N
        int N = scanner.nextInt(); // 사람의 수를 입력받음 (1 <= N <= 50)
        scanner.nextLine(); // 버퍼 비우기

        // 2. 친구 관계 저장을 위한 2차원 배열 생성
        char[][] friendship = new char[N][N];
        // friendship[i][j]는 i번 사람과 j번 사람이 친구인지 여부를 저장
        // 'Y'이면 친구, 'N'이면 친구가 아님

        // 3. 친구 관계 입력
        for (int i = 0; i < N; i++) {
            friendship[i] = scanner.nextLine().toCharArray();
            // 한 줄씩 친구 관계를 입력받아 char 배열로 저장
        }

        // 4. 2-친구 수 계산
        int maxTwoFriends = 0; // 가장 많은 2-친구 수를 저장

        // 각 사람 i에 대해 2-친구 수를 계산
        for (int i = 0; i < N; i++) {
            boolean[] isTwoFriend = new boolean[N];
            // isTwoFriend[j]가 true면 i번 사람과 j번 사람이 2-친구임

            // 4.1 i번 사람의 친구 탐색
            for (int j = 0; j < N; j++) {
                if (friendship[i][j] == 'Y') {
                    // i와 j가 직접 친구라면
                    isTwoFriend[j] = true; // j는 i의 2-친구

                    // 4.2 j번 사람의 친구 탐색
                    for (int k = 0; k < N; k++) {
                        if (friendship[j][k] == 'Y' && k != i) {
                            // j의 친구 k가 i 자신이 아니면
                            isTwoFriend[k] = true; // k는 i의 2-친구
                        }
                    }
                }
            }

            // 4.3 i번 사람의 2-친구 수 계산
            int count = 0; // i번 사람의 2-친구 수
            for (boolean f : isTwoFriend) {
                if (f) count++; // true인 경우 2-친구로 카운트
            }

            // 4.4 가장 많은 2-친구 수 갱신
            maxTwoFriends = Math.max(maxTwoFriends, count);
        }

        // 5. 결과 출력
        System.out.println(maxTwoFriends);
        // 가장 많은 2-친구 수를 출력
    }
}
