package solvedac;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 피보나치수4 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());

        if (n == 0) {
            System.out.println("0");
        } else if (n == 1) {
            System.out.println("1");
        } else {
            // 피보나치 수 계산

            // BigInteger로 초기화
            BigInteger[] arr = new BigInteger[n + 1];
            arr[0] = BigInteger.ZERO;
            arr[1] = BigInteger.ONE;

            for (int i = 2; i <= n; i++) {
                arr[i] = arr[i - 1].add(arr[i - 2]);
            }

            System.out.println(arr[n]);
        }
    }
}
