import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = line.length();
        boolean[] bulbs = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            bulbs[i + 1] = line.charAt(i) == 'Y';
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (bulbs[i]) {
                count++;
                for (int j = i; j <= n; j += i) {
                    bulbs[j] = !bulbs[j];
                }
            }
        }

        System.out.println(count);
    }
}
