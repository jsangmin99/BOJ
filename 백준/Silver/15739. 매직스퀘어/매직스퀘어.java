import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int hap = n * (n * n + 1) / 2;
        int[][] arr = new int[n][n];
        boolean[] used = new boolean[n * n + 1];  // 1부터 n*n까지의 숫자 사용 여부 체크

        StringTokenizer st;
        // 입력 받기 및 중복 체크
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int number = Integer.parseInt(st.nextToken());
                if (number < 1 || number > n * n || used[number]) {
                    System.out.println("FALSE");
                    return;
                }
                used[number] = true;
                arr[i][j] = number;
            }
        }

        // 행 검사
        for (int i = 0; i < n; i++) {
            int row = 0;
            for (int j = 0; j < n; j++) {
                row += arr[i][j];
            }
            if (row != hap) {
                System.out.println("FALSE");
                return;
            }
        }

        // 열 검사
        for (int j = 0; j < n; j++) {
            int col = 0;
            for (int i = 0; i < n; i++) {
                col += arr[i][j];
            }
            if (col != hap) {
                System.out.println("FALSE");
                return;
            }
        }

        // 대각선 검사
        int mainDiag = 0, antiDiag = 0;
        for (int i = 0; i < n; i++) {
            mainDiag += arr[i][i];
            antiDiag += arr[i][n - 1 - i];
        }
        if (mainDiag != hap || antiDiag != hap) {
            System.out.println("FALSE");
            return;
        }
        
        System.out.println("TRUE");
    }
}
