import java.util.*;

public class 반복수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        int K = sc.nextInt();
        long M = sc.nextLong();

        int count = 0;

        for (int i = 1; i < 1_000_000; i++) {
            String base = Integer.toString(i);
            if (base.length() != K)
                continue; // K자리가 아니면 스킵

            long value = i;
            int digitIndex = 0;

            while (value <= B) {
                if (value >= A && value % M == 0) {
                        System.out.println("Found: " + value + " from base: " + base);
                    count++;
                }

                // 다음 자리수 이어붙이기 가장 끝에 base의 digit 추가
                int nextDigit = base.charAt(digitIndex % K) - '0';
                value = value * 10 + nextDigit;
                digitIndex++;
            }
        }

        System.out.println(count);
    }
}
