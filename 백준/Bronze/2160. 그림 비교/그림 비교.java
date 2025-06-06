import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거

        // 그림 데이터 저장 배열 (N개의 그림, 각 그림은 5줄)
        String[][] pictures = new String[N][5];

        // 입력 받기 (각 그림은 5줄)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                pictures[i][j] = scanner.nextLine();
            }
        }

        scanner.close();

        int minDifference = Integer.MAX_VALUE;
        int picture1 = -1;
        int picture2 = -1;

        // 두 개의 그림을 비교하여 가장 비슷한 그림 찾기
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                int difference = countDifferences(pictures[i], pictures[j]);

                // 최소 차이를 가진 그림 갱신
                if (difference < minDifference) {
                    minDifference = difference;
                    picture1 = i + 1; // 1-based index
                    picture2 = j + 1;
                }
            }
        }

        // 결과 출력
        System.out.println(picture1 + " " + picture2);
    }

    // 두 개의 그림을 비교하여 다른 칸의 개수를 세는 함수
    private static int countDifferences(String[] pic1, String[] pic2) {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (pic1[i].charAt(j) != pic2[i].charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
}
