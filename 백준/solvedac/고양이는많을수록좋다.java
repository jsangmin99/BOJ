package solvedac;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 고양이는많을수록좋다 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        long n = Long.parseLong(br.readLine());
        int cnt = 0;
        while (n > 3) {
            cnt++;
            n = n/2 + (n%2==1?1:0);
        }
        System.out.println(cnt + n);
    }
}