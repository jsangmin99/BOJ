package solvedac;

import java.util.Scanner;

public class 단어나누기 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        scanner.close();

        String result = null;

        // 단어를 세 부분으로 나누기
        for (int i = 1; i < word.length() - 1; i++) {
            for (int j = i + 1; j < word.length(); j++) {
                String part1 = word.substring(0, i);
                String part2 = word.substring(i, j);
                String part3 = word.substring(j);

                // 각 부분 뒤집기
                String reversed = reverse(part1) + reverse(part2) + reverse(part3);

                // 사전순으로 가장 앞서는 단어 찾기
                if (result == null || reversed.compareTo(result) < 0) {
                    result = reversed;
                }
            }
        }

        System.out.println(result);
    }

    // 문자열 뒤집는 메서드
    private static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
}
