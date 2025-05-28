import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()); //양념
        int B = Integer.parseInt(st.nextToken()); //후라이드
        int C = Integer.parseInt(st.nextToken()); //반반
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());


        int minCost = Integer.MAX_VALUE;

        // 반반 치킨을 최대 2 * max(X, Y) 마리까지 고려
        for (int half = 0; half <= 2 * Math.max(X, Y); half += 2) {
            int halfCount = half / 2;
            int aCount = Math.max(0, X - halfCount);
            int bCount = Math.max(0, Y - halfCount);
            int cost = half * C + aCount * A + bCount * B;

            minCost = Math.min(minCost, cost);
        }

        System.out.println(minCost);

    }
}
