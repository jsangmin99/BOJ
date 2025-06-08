import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] files = new String[n];

        for (int i = 0; i < n; i++) {
            files[i] = br.readLine();
        }

        int length = files[0].length();
        StringBuilder pattern = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char current = files[0].charAt(i);
            boolean allMatch = true;

            for (int j = 1; j < n; j++) {
                if (files[j].charAt(i) != current) {
                    allMatch = false;
                    break;
                }
            }

            if (allMatch) {
                pattern.append(current);
            } else {
                pattern.append("?");
            }
        }

        System.out.println(pattern.toString());
    }
}
