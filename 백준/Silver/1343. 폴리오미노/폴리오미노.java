import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board = br.readLine();

        StringBuilder result = new StringBuilder();
        int count = 0; // 연속된 'X'의 개수

        for (int i = 0; i < board.length(); i++) {
            char c = board.charAt(i);

            if (c == 'X') {
                count++; // 'X'의 개수를 증가시킴
            } else {
                // 연속된 'X'를 처리
                if (count > 0) {
                    if (count % 2 != 0) {
                        System.out.println("-1"); // 덮을 수 없는 경우
                        return;
                    }
                    result.append("AAAA".repeat(count / 4));
                    result.append("BB".repeat((count % 4) / 2));
                    count = 0; // 초기화
                }
                result.append(c); // '.' 추가
            }
        }

        // 마지막 연속된 'X' 처리
        if (count > 0) {
            if (count % 2 != 0) {
                System.out.println("-1"); // 덮을 수 없는 경우
                return;
            }
            result.append("AAAA".repeat(count / 4));
            result.append("BB".repeat((count % 4) / 2));
        }

        System.out.println(result.toString());
    }
}
