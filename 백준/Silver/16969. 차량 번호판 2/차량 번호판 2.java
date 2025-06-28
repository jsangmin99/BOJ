import java.util.Scanner;

public class Main {
    static final int MOD = 1_000_000_009;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String format = sc.nextLine();
        sc.close();

        long result = 1;

        for (int i = 0; i < format.length(); i++) {
            char now = format.charAt(i);
            char prev = (i > 0) ? format.charAt(i - 1) : ' ';

            if (now == 'c') {
                result *= (prev == 'c') ? 25 : 26;
            } else { // now == 'd'
                result *= (prev == 'd') ? 9 : 10;
            }

            result %= MOD;
        }

        System.out.println(result);
    }
}
