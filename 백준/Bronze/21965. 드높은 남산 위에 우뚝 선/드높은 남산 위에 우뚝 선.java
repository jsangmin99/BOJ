import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (n == 1) {
            System.out.println("NO");
            return;
        }

        int i = 1;

        while (i < n && arr[i] > arr[i - 1]) {
            i++;
        }


        // 감소하는 구간 탐색

        while (i < n && arr[i] < arr[i - 1]) {
            i++;
        }

        if (i == n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
