package solvedac;

import java.io.*;
import java.util.StringTokenizer;

public class 과자 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int result = Math.max(k * n - m, 0);
        System.out.println(result);
    }
}
