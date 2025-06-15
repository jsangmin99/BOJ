import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static String input;
    static long k;
    static int len;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();
        k = Long.parseLong(br.readLine());
        len = input.length();

        StringBuilder answer = new StringBuilder();
        if (!dfs(0, k - 1, answer)) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
    }

    static boolean dfs(int idx, long k, StringBuilder sb) {
        if (idx == len) {
            return k == 0;
        }
        char c = input.charAt(idx);
        List<Character> candidates = new ArrayList<>();

        if (c == '1' || c == '6') {
            candidates.add('1');
            candidates.add('6');
        } else if (c == '2' || c == '7') {
            candidates.add('2');
            candidates.add('7');
        } else {
            candidates.add(c);
        }
        Collections.sort(candidates); // 사전순 정렬

        for (char ch : candidates) {
            long rest = countCases(idx + 1); // 나머지 자리수 경우의 수
            if (k < rest) {
                sb.append(ch);
                return dfs(idx + 1, k, sb);
            } else {
                k -= rest;
            }
        }

        return false; // k번째 존재하지 않음
    }

    static long countCases(int fromIdx) {
        long cnt = 1;
        for (int i = fromIdx; i < len; i++) {
            char c = input.charAt(i);
            if (c == '1' || c == '6' || c == '2' || c == '7')
                cnt *= 2;
        }
        return cnt;
    }

}
