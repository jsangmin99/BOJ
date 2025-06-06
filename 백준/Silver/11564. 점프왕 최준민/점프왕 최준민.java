import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long k = Long.parseLong(st.nextToken());
        long start = Long.parseLong(st.nextToken());
        long end = Long.parseLong(st.nextToken());

        long result;

        if (start == 0 || end == 0 || (start < 0 && end > 0)) {
            // 0 포함 구간
            result = 1 + Math.abs(start) / k + end / k;
        } else {
            // 한쪽 부호로 치우친 구간
            start = Math.abs(start);
            end = Math.abs(end);

            if (start > end) {
                long temp = start;
                start = end;
                end = temp;
            }

            result = end / k - start / k;
            if (start % k == 0) {
                result += 1;
            }
        }

        System.out.println(result);
    }
}
