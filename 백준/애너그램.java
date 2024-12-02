import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class 애너그램{
    static String str;
    static int len;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        while (test-- > 0) {
            str = br.readLine();
            len = str.length();
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            boolean[] used = new boolean[len];
            dfs(arr, used, new StringBuilder(), 0);
        }
    }

    public static void dfs(char[] arr, boolean[] used, StringBuilder sb, int depth) {
        if (depth == len) {
            System.out.println(sb.toString());
            return;
        }

        for (int i = 0; i < len; i++) {
            if (used[i]) continue;
            if (i > 0 && arr[i] == arr[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            sb.append(arr[i]);
            dfs(arr, used, sb, depth + 1);
            sb.deleteCharAt(sb.length() - 1);
            used[i] = false;
        }
    }
}
