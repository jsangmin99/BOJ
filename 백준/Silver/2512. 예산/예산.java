import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        long m = Long.parseLong(br.readLine());

        Arrays.sort(arr);
        
        long left = 0;
        long right = arr[n - 1];
        int result = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            long total = 0;
            for (int i = 0; i < n; i++) {
                total += Math.min(arr[i], mid);
            }
            if (total <= m) {
                result = (int) mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(result);
    }
}
