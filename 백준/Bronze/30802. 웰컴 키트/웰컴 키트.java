import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // 첫째중 N 참가자의수
    // 사이즈별 신청자수
    // 티셔츠 tn T 펜의 묶음수 P
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[6];

        int result1 = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 6; i++) {
            if (arr[i] % T == 0) {
                result1 += arr[i] / T;
            } else {
                result1 += arr[i] / T + 1;
            }
        }
        System.out.println(result1);
        System.out.println(N / P + " " + N % P);

    }
}
