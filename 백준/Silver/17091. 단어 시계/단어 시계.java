import java.util.Scanner;

public class Main {
    // 숫자를 단어로 변환하는 배열
    private static final String[] NUM_WORDS = {
        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
        "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six",
        "twenty seven", "twenty eight", "twenty nine"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 시와 분 입력 받기
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        // 결과를 저장할 변수
        String result;

        if (m == 0) {
            // 분이 0일 때
            result = NUM_WORDS[h] + " o' clock";
        } else if (m == 15) {
            // 분이 15일 때 (quarter past)
            result = "quarter past " + NUM_WORDS[h];
        } else if (m == 30) {
            // 분이 30일 때 (half past)
            result = "half past " + NUM_WORDS[h];
        } else if (m == 45) {
            // 분이 45일 때 (quarter to)
            result = "quarter to " + NUM_WORDS[(h % 12) + 1];
        } else if (m < 30) {
            // 분이 1 이상 29 이하일 때 (past)
            result = NUM_WORDS[m] + (m == 1 ? " minute past " : " minutes past ") + NUM_WORDS[h];
        } else {
            // 분이 31 이상 59 이하일 때 (to)
            int minutesToNextHour = 60 - m;
            result = NUM_WORDS[minutesToNextHour] + (minutesToNextHour == 1 ? " minute to " : " minutes to ") + NUM_WORDS[(h % 12) + 1];
        }

        // 결과 출력
        System.out.println(result);

        scanner.close();
    }
}
