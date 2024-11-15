package MyBoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class 지능형기차2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int output = Integer.parseInt(st.nextToken());
            int input = Integer.parseInt(st.nextToken());
            sum = sum + input - output;
            if (sum >= max) {
                max = sum;
            }
        }

        System.out.println(max);
    }
}
