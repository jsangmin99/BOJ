import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Collections.reverseOrder());
        int answer = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] == 0) {
                break;
            }
            answer = Math.max(answer, i + arr[i]);
        }

        System.out.println(Math.min(answer, N));
    }
}
