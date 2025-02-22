import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Long num = Long.parseLong(s);

        if (!isPrime(num)) {
            System.out.println("no");
            return;
        }

        String reverseS = getReverseNumber(s);
        if (reverseS.equals("invalid")) {
            System.out.println("no");
            return;
        }

        long reverseNum = Long.parseLong(reverseS);
        if (!isPrime(reverseNum)) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }

    private static boolean isPrime(Long n) {
        if (n < 2) return false;
        if (n == 2) return true; // 2는 유일한 짝수 소수
        if (n % 2 == 0) return false; // 짝수는 소수 아님

        for (long i = 3; i * i <= n; i += 2) { // 홀수만 체크 (2씩 증가)
            if (n % i == 0) return false;
        }
        return true;
    }

    private static String getReverseNumber(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            switch (c) {
                case '0':
                    sb.append('0');
                    break;
                case '1':
                    sb.append('1');
                    break;
                case '2':
                    sb.append('2');
                    break;
                case '6':
                    sb.append('9');
                    break;
                case '5':
                    sb.append('5');
                    break;
                case '8':
                    sb.append('8');
                    break;
                case '9':
                    sb.append('6');
                    break;
                default:
                    return "invalid";
            }
        }
        return sb.toString();
    }
}
