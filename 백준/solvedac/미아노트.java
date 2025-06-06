package solvedac;

import java.util.Scanner;

public class 미아노트 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 처리
        int n = scanner.nextInt(); // 원래 문자열 길이
        int h = scanner.nextInt(); // 세로로 번진 글자의 개수
        int w = scanner.nextInt(); // 가로로 번진 글자의 개수
        scanner.nextLine(); // 버퍼 정리

        // 번진 문자열을 저장할 배열
        char[][] blurred = new char[h][n * w];
        for (int i = 0; i < h; i++) {
            blurred[i] = scanner.nextLine().toCharArray();
        }

        // 원래 문자열 복원
        StringBuilder original = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char restoredChar = '?'; // 복원된 문자, 기본은 '?'로 초기화
            for (int j = 0; j < h; j++) {
                for (int k = 0; k < w; k++) {
                    char currentChar = blurred[j][i * w + k];
                    if (currentChar != '?') {
                        restoredChar = currentChar;
                    }
                }
            }
            original.append(restoredChar); // 복원된 문자 추가
        }

        // 결과 출력
        System.out.println(original.toString());

        scanner.close();
    }
}
