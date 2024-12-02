package solvedac;

import java.util.Scanner;

public class BOJ_21734 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            int asciValue = (int) c;
            int digitSum = sumOfDigits(asciValue);

            for(int j =0; j <digitSum; j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
