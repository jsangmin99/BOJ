import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();
        char[][] friendship = new char[N][N];

        // 친구 관계 입력
        for (int i = 0; i < N; i++) {
            friendship[i] = scanner.nextLine().toCharArray();
        }

        // 2-친구 수 계산
        int maxTwoFriends = 0;

        for (int i = 0; i < N; i++) {
            boolean[] isTwoFriend = new boolean[N];

            for (int j = 0; j < N; j++) {
                if (friendship[i][j] == 'Y') {
                    isTwoFriend[j] = true; // 직접 친구
                    for (int k = 0; k < N; k++) {
                        if (friendship[j][k] == 'Y' && k != i) {
                            isTwoFriend[k] = true; // 친구의 친구
                        }
                    }
                }
            }

            int count = 0;
            for (boolean f : isTwoFriend) {
                if (f) count++;
            }
            maxTwoFriends = Math.max(maxTwoFriends, count);
        }

        System.out.println(maxTwoFriends);
    }
}
