import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int joka = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int max = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }
        System.out.println(binarySearch(arr, joka, 1, max));

    }

    private static int binarySearch(int[] arr, int joka, int left, int right) {
        int result = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                count += arr[i] / mid;
            }
            if (count >= joka) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

}
