import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 다음다양한단어 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 1. 길이가 26보다 작은 경우 (뒤에 새로운 알파벳을 붙일 수 있는 경우)
        if (s.length() < 26) {
            Set<Character> usedChars = new HashSet<>();
            for (char c : s.toCharArray()) {
                usedChars.add(c);
            }

            for (char c = 'a'; c <= 'z'; c++) {
                if (!usedChars.contains(c)) {
                    System.out.println(s + c);
                    return;
                }
            }
        }

        // 2. 길이가 26인 경우
        for (int i = s.length() - 1; i >= 0; i--) { // 뒤에서부터 탐색
            Set<Character> usedCharsPrefix = new HashSet<>();
            for (int j = 0; j < i; j++) {
                usedCharsPrefix.add(s.charAt(j));
            }

            // 현재 문자보다 크고 사용되지 않은 알파벳 찾기
            for (char c = (char) (s.charAt(i) + 1); c <= 'z'; c++) { 
                if (!usedCharsPrefix.contains(c)) {
                    // 뒤에 더 붙일 필요 없게
                    System.out.println(s.substring(0, i) + c);
                    return;
                }
            }
        }

        System.out.println("-1");
        sc.close();
    }
}
