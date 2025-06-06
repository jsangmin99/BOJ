import java.io.BufferedReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] arr = new long[n + 1];

        arr[1] = 1;
        if (n >= 2) arr[2] = 1;
        if (n >= 3) arr[3] = 1;

        for (int i = 4; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 3];
        }
        System.out.println(arr[n]);

    }
}
