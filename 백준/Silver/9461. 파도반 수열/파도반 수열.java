import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Long[] arr = new Long[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        arr[0] = 0L;
        arr[1] = 1L;
        arr[2] = 1L;
        arr[3] = 1L;

        int T = Integer.parseInt(br.readLine());

        for (int i = 4; i < 101; i++) {
            arr[i] = arr[i - 3] + arr[i - 2];
        }

        for (int i = 0; i < T; i++) {
            sb.append(arr[Integer.parseInt(br.readLine())]).append("\n");
        }
        System.out.println(sb);

    }
}
