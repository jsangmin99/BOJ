import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] benefit = new int[n];
        int[] price = new int[n];

        // 이익 배열 입력 및 전역 최대, 두 번째 최대, 최대값 등장 횟수 계산
        StringTokenizer st = new StringTokenizer(br.readLine());
        int globalMax = 0;
        int secondMax = 0;
        int countGlobalMax = 0;
        for (int i = 0; i < n; i++) {
            benefit[i] = Integer.parseInt(st.nextToken());
            if (benefit[i] > globalMax) {
                secondMax = globalMax;
                globalMax = benefit[i];
                countGlobalMax = 1;
            } else if (benefit[i] == globalMax) {
                countGlobalMax++;
            } else if (benefit[i] > secondMax) {
                secondMax = benefit[i];
            }
        }

        // 가격 배열 입력 (문제 정의에서는 최종 순수익 계산에 가격이 상쇄되지만, 입력은 그대로 받아야 함)
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        // 각 물건에 대해 순수익 계산
        for (int i = 0; i < n; i++) {
            int bestOther; // 자신을 제외한 물건들 중 최대 이익
            if (benefit[i] == globalMax) {
                // 최대 이익을 가진 물건이 여러 개이면 다른 물건의 최대 이익은 globalMax, 유일하면 secondMax
                bestOther = (countGlobalMax > 1) ? globalMax : secondMax;
            } else {
                bestOther = globalMax;
            }
            // 순수익 = benefit[i] - (bestOther)
            int realProfit = benefit[i] - bestOther;
            sb.append(realProfit).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
