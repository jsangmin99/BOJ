package solvedac;

import java.util.Scanner;

public class 문어 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder result = new StringBuilder();

        if (N % 2 == 0) {
            for (int i = 0; i < N; i++) {
                result.append((i % 2) + 1).append(" ");
            }
        } else {
            for (int i = 0; i < N; i++) {
                result.append((i % 3) + 1).append(" ");
            }
        }

        System.out.println(result.toString().trim());

    }
}
