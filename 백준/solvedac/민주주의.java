package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 민주주의 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int result = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (s.charAt(j) == 'O') {
                    count++;
                }
            }
            if (m / 2 < count) {
                result++;
            }
        }
        System.out.println(result);


    }
}
