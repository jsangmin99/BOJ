
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[31][31];

        for (int i = 0; i < 31; i++) {
            arr[i][0] = 1;
            arr[i][i] = 1;
        }

        for (int i = 1; i < 31; i++) {
            for (int j = 1; j <= i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }

        System.out.println(arr[n - 1][m - 1]);

    }

}
