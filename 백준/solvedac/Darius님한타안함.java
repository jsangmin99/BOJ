package solvedac;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Darius님한타안함 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        // "K/D/A" 형태의 입력을 '/' 기준으로 분리
        String[] values = input.split("/");
        int K = Integer.parseInt(values[0]);
        int D = Integer.parseInt(values[1]);
        int A = Integer.parseInt(values[2]);

        // 조건 검사
        if (K + A < D || D == 0) {
            System.out.println("hasu");
        } else {
            System.out.println("gosu");
        }
    }
}
