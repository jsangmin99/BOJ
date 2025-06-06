package solvedac;

import java.util.Scanner;

public class 수들의합 {
    public static void main(String[] args) {
//        N 까지의 합은
//        N * (N + 1) / 2
        long S = 0; //입력값
        long N = 0; // 자연수의 갯수
        long sum = 0; // 합

        Scanner sc = new Scanner(System.in);
        S = sc.nextLong();

//         1부터 순차적으로 더하며 합이 S를 넘지않도록 체크
        while (sum + (N + 1) <= S) {
            N++;
            sum += N;
        }
        System.out.println(N);
    }
}
