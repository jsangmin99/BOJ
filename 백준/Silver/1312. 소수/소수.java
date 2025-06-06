import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        // 나머지를 저장
        int remain = A % B;

        // 소수점 아래 N번째 자리까지 계산
        int digit = 0;
        for (int i = 0; i < N; i++) {
            remain *= 10;
            digit = remain / B; // 몫이 현재 자리수
            remain %= B; // 나머지를 갱신
        }

        System.out.println(digit);
    }
}
