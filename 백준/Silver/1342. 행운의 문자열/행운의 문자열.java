import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static char[] chars;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        chars = s.toCharArray();
        Arrays.sort(chars);
        visited = new boolean[chars.length];

        backtrack(new StringBuilder(), '\0');

        System.out.println(count);
    }

    static void backtrack(StringBuilder current, char prevChar) {
        if (current.length() == chars.length) {
            count++;
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (visited[i]) continue;


            if (i > 0 && chars[i] == chars[i - 1] && !visited[i - 1]) continue;

            if (chars[i] == prevChar) continue;

            visited[i] = true;
            current.append(chars[i]);

            backtrack(current, chars[i]);

            current.deleteCharAt(current.length() - 1);
            visited[i] = false;
        }
    }
}
