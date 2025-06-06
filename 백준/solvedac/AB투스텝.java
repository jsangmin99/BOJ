import java.util.Scanner;

public class AB투스텝 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // 1 또는 2

        if (T == 1) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            long sum = A + B;

            StringBuilder sb = new StringBuilder("aaaaaaaaaaaaa"); // 13자리 초기화
            for (int i = 0; i < 13; i++) {
                if (sum > 0) {
                    char ch = (char) ('a' + (sum % 26));
                    sb.setCharAt(i, ch);
                    sum /= 26;
                } else {
                    break;
                }
            }
            System.out.println(sb.toString());
        } else {
            String s = sc.next();
            long result = 0;
            long multiplier = 1;

            for (int i = 0; i < s.length(); i++) {
                int val = s.charAt(i) - 'a';
                result += val * multiplier;
                multiplier *= 26;
            }
            System.out.println(result);
        }
    }
}
