import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1)
                break;

            boolean solution = false;
            for (int k = (int) Math.sqrt(n) + 1; k >= 2; k--) {
                int coconut = n;
                boolean isSuccess = true;
                for (int i = 0; i < k; i++) {
                    if ((coconut - 1) % k != 0) {
                        isSuccess = false;
                        break;
                    }
                    coconut = ((coconut - 1) / k) * (k - 1);
                }
                if(isSuccess && coconut % k == 0){
                    System.out.printf("%d coconuts, %d people and 1 monkey\n", n, k);
                    solution = true;
                    break;
                }
            }
            if (!solution) {
                System.out.printf("%d coconuts, no solution\n", n);

            }

        }

    }

}
