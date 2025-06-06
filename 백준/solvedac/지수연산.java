package solvedac;

import java.math.BigDecimal;
import java.util.Scanner;

public class 지수연산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        BigDecimal result = BigDecimal.ONE.divide(BigDecimal.valueOf(2).pow(n));

        System.out.println(result.stripTrailingZeros().toPlainString());

    }
}
