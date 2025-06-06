import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int count = 0;

        while (N > 0) {
            String s = String.valueOf(N);

            if (s.contains("1")) {
                int idx = s.indexOf('1');
                String newStr = s.substring(0, idx) + s.substring(idx + 1);

                if (newStr.isEmpty()) {
                    N = 0;
                } else {
                    N = Long.parseLong(newStr);
                }
            } else {
                N--;
            }
            count++;
        }

        System.out.println(count);
    }
}
