import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 홀수만더하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                int number = Integer.parseInt(st.nextToken());
                if (number % 2 != 0) {
                    sum += number;
                }
            }
            System.out.println("#" + i+1 +" " + sum);

        }

    }

}
