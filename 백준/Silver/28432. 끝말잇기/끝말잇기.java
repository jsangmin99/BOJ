import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] record = new String[n];
        int questionIndex = -1;

        for (int i = 0; i < n; i++) {
            record[i] = br.readLine();
            if (record[i].equals("?")) {
                questionIndex = i;
            }
        }

        int m = Integer.parseInt(br.readLine());
        List<String> candidates = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            candidates.add(br.readLine());
        }
        for (String candidate : candidates) {
            boolean isValid = true;

            for (String word : record) {
                if (word.equals(candidate)) {
                    isValid = false;
                    break;
                }
            }
            if (!isValid)
                continue;
            if (questionIndex > 0) {
                String prev = record[questionIndex - 1];
                if (prev.charAt(prev.length() - 1) != candidate.charAt(0)) {
                    continue;
                }
            }
            if (questionIndex < n - 1) {
                String next = record[questionIndex + 1];
                if (next.charAt(0) != candidate.charAt(candidate.length() - 1)) {
                    continue;
                }
            }
            System.out.println(candidate);
            return;
        }

    }

}
