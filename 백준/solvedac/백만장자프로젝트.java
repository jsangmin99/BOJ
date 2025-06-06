import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백만장자프로젝트 {
   public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int n;
        int[] arr;
        for (int test_case = 1; test_case <= T; test_case++) {
            n = Integer.parseInt(br.readLine());

            arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            long profit = 0;
            long maxPrice = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] > maxPrice) {
                    maxPrice = arr[i];
                } else {
                    profit += maxPrice - arr[i];
                }
            }
            System.out.println("#" + (test_case) + " " + profit);
        }
    } 
}
