package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 다각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long start = (a % 2 == 0) ? a : a + 1;
        long end = (b % 2 == 0) ? b : b - 1;

        if (start > end) {
            System.out.println(0);
            return;
        }

        long count = ((end - start) / 2) + 1;
        long result = count * (start + end) / 2;

        System.out.println(result);
    }
}
