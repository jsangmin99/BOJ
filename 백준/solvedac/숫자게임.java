package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 숫자게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int best = -1;
        int bestPlayer = 0;
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] cards = new int[5];
            for (int j = 0; j < 5; j++) {
                cards[j] = Integer.parseInt(st.nextToken());
            }

            int nowBigOne = 0;
            for (int a = 0; a < 5; a++) {
                for (int b = a + 1; b < 5; b++) {
                    for (int c = b + 1; c < 5; c++) {
                        int sum = cards[a] + cards[b] + cards[c];
                        int one = sum % 10;
                        nowBigOne = Math.max(one, nowBigOne);
                    }
                }
            }

            if (nowBigOne >= best) {
                best = nowBigOne;
                bestPlayer = i;
            }
        }
        System.out.println(bestPlayer);

    }
}
