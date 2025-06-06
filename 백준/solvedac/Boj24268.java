package solvedac;

import java.io.*;
import java.util.*;

public class Boj24268 {
    static int N, d, maxPossibleNumber;
    static int minResult = Integer.MAX_VALUE;
    static boolean[] used;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 시작 숫자 N
        d = Integer.parseInt(st.nextToken()); // 진법 d

        // 만들 수 있는 최대 수를 미리 계산
        maxPossibleNumber = calculateMaxPossibleNumber(d);

        // N이 최대 가능한 수보다 크면 바로 -1 출력
        if (N >= maxPossibleNumber) {
            System.out.println(-1);
            return;
        }

        used = new boolean[d];
        findMinNumber(0, 0);

        System.out.println(minResult);
    }

    // 백트래킹을 사용하여 가능한 숫자 생성
    private static void findMinNumber(int num, int count) {
        if (count == d) { // d개의 숫자를 사용한 경우
            if (num > N) {
                minResult = Math.min(minResult, num);
            }
            return;
        }

        for (int i = 0; i < d; i++) {
            if (!used[i]) {
                used[i] = true;
                findMinNumber(num * d + i, count + 1);
                used[i] = false;
            }
        }
    }

    // d자리 수에서 만들 수 있는 가장 큰 숫자를 계산 (예: d=5 → 43210 (10진수 변환))
    private static int calculateMaxPossibleNumber(int d) {
        int maxNum = 0;
        for (int i = d - 1; i >= 0; i--) {
            maxNum = maxNum * d + i;
        }
        return maxNum;
    }
}
