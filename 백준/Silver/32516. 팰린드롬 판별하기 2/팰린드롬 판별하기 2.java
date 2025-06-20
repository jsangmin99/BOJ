import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String T = sc.next();

        int cnt = 0;
        for (int i = 0; i < N / 2; ++i) {
            char left = T.charAt(i);
            char right = T.charAt(N - i - 1);

            if (left == right) {
                if (left == '?') {
                    cnt += 26;
                }
            } else {
                if (left == '?' || right == '?') {
                    cnt += 1;
                } else {
                    System.out.println(0);
                    return;
                }
            }
        }

        System.out.println(cnt);
    }
}
