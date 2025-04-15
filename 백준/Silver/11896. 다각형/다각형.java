import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long start = Math.max(a, 4);
        if (start % 2 != 0) start++;
        long end = (b % 2 == 0) ? b : b - 1;

        if (start > end) {
            System.out.println(0);
            return;
        }

        long count = ((end - start) / 2) + 1;

        long result;
        if ((start + end) % 2 == 0) {
            result = count * ((start + end) / 2);
        } else {
            result = (count / 2) * (start + end);
        }

        System.out.println(result);
    }
}
