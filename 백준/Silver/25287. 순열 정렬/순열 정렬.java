import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static boolean isNoneDecreasing(int[] arr, int n) {
        int preve = 0;

        for (int i = 0; i < n; i++) {
            int a = arr[i];
            int b = n - a + 1;

            int first = Math.min(a, b);
            int second = Math.max(a, b);
            if (first >= preve) {
                preve = first;
            } else if (second >= preve) {
                preve = second;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            System.out.println(isNoneDecreasing(arr, n) ? "YES" : "NO");

       }
    }
}
