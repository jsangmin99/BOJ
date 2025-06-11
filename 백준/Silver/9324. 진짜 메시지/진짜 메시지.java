import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            String s = br.readLine();
            Map<Character, Integer> count = new HashMap<>();
            boolean isFake = false;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                count.put(c, count.getOrDefault(c, 0) + 1);
                if (count.get(c) == 3) {
                    if (i + 1 >= s.length() || s.charAt(i + 1) != c) {
                        isFake = true;
                        break;
                    }
                    i++;
                    count.put(c, 0);
                }
            }
            System.out.println(isFake ? "FAKE" : "OK");

        }
    }

}
