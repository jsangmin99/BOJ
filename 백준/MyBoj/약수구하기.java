package MyBoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 약수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int result = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                cnt++;
                if (cnt == n) { 
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(result);

    }
}
