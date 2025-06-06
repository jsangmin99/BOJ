import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int result = 0;

        for (int i = 0; i < s.length() - 2; i++) {
            String sub = s.substring(i, i + 3);
            int n1 = sub.charAt(0) - '0';
            int n2 = sub.charAt(1) - '0';
            int n3 = sub.charAt(2) - '0';

            if (n1 + 1 == n2 && n2 + 1 == n3) {
                result++;
                if (i + 3 < s.length()) {
                    int n4 = s.substring(i + 3, i + 4).charAt(0) - '0';
                    if (n3 + 1 == n4) {
                        i += 3;
                        result--;
                    }
                }
            }
        }
        System.out.println(result);

    }
}
