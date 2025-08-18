import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    // p, q: 각 컴퓨터에서 한 작업을 처리하는 데 걸리는 시간
    private static double best(double p, double q) {
        double bothAtOnce = Math.max(p, q); // 각자 하나씩
        double allOnP = 2 * p; // p에서 두 개 연속
        double allOnQ = 2 * q; // q에서 두 개 연속
        return Math.min(bothAtOnce, Math.min(allOnP, allOnQ));
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double m = Double.parseDouble(st.nextToken());
        double n = Double.parseDouble(st.nextToken());

        // 가속기를 재현/우영 중 어디에 꽂을지 두 경우 비교
        double case1 = best(m / a, n); // 재현이에게 가속기
        double case2 = best(m, n / a); // 우영이에게 가속기
        double ans = Math.min(case1, case2);

        // 출력 형식: 불필요한 0 제거 (정수면 정수로)
        String s = String.format(java.util.Locale.US, "%.10f", ans)
                .replaceAll("0+$", "")
                .replaceAll("\\.$", "");
        System.out.println(s);
    }
}
