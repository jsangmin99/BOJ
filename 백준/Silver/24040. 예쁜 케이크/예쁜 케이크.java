import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            long n = Long.parseLong(br.readLine());

            if (n % 9 == 0) {
                System.out.println("TAK");
            } else if (n % 3 == 2) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        }

    }
}
