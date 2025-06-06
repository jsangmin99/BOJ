import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashSet;

public class 놀라운문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!(line = br.readLine()).equals("*")) {
            boolean isSurprising = true;
            int len = line.length();

            for (int d = 0; d < len - 1; d++) {
                HashSet<String> pairs = new HashSet<>();
                for (int i = 0; i + 1 + d < len; i++) {
                    String pair = "" + line.charAt(i) + line.charAt(i + 1 + d);
                    if (pairs.contains(pair)) {
                        isSurprising = false;
                        break;
                    }
                    pairs.add(pair);
                }
                if (!isSurprising)
                    break;
            }
            if (isSurprising) {
                System.out.println(line + " is surprising.");
            } else {
                System.out.println(line + " is NOT surprising.");
            }

        }

    }

}
