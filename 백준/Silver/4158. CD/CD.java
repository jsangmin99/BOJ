import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input;

        while (!(input = br.readLine()).equals("0 0")) {
            // N: 상근이가 가진 CD 수, M: 선영이가 가진 CD 수
            StringTokenizer st = new StringTokenizer(input);
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            // 상근이와 선영이가 가진 CD 번호 저장
            int[] sangGeunCDs = new int[n];
            int[] sunYoungCDs = new int[m];

            for (int i = 0; i < n; i++) {
                sangGeunCDs[i] = Integer.parseInt(br.readLine());
            }

            for (int i = 0; i < m; i++) {
                sunYoungCDs[i] = Integer.parseInt(br.readLine());
            }

            // 투 포인터로 교집합 구하기
            int i = 0, j = 0, count = 0;
            while (i < n && j < m) {
                if (sangGeunCDs[i] == sunYoungCDs[j]) { // 공통 CD
                    count++;
                    i++;
                    j++;
                } else if (sangGeunCDs[i] < sunYoungCDs[j]) {
                    i++; // 상근이 CD가 작으므로 증가
                } else {
                    j++; // 선영이 CD가 작으므로 증가
                }
            }

            sb.append(count).append("\n");
        }

        System.out.print(sb);
    }
}
