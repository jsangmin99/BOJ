import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ISBM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int sum = 0;
        int starIndex = -1;

        for (int i = 0; i < 13; i++) {
            char ch = s.charAt(i);
            if (ch == '*') {
                starIndex = i;
            } else {
                sum += i % 2 == 0 ? ch - '0' : (ch - '0') * 3;
            }
        }


        for (int i = 0; i <= 9; i++) {
            if (starIndex % 2 == 0) {
                if ((sum +i) % 10 == 0) {
                    System.out.println(i);
                    break;
                }
            } else {
                if ((sum + i * 3) % 10 == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }

    }

}
