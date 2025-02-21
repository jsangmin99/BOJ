import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        StringBuilder consensusDNA = new StringBuilder();
        int hammingSum = 0;

        // 각 위치별로 가장 많이 등장하는 문자 선택
        for (int i = 0; i < m; i++) {
            int a = 0, c = 0, g = 0, t = 0;

            for (int j = 0; j < n; j++) {
                switch (arr[j].charAt(i)) {
                    case 'A': a++; break;
                    case 'C': c++; break;
                    case 'G': g++; break;
                    case 'T': t++; break;
                }
            }

            // 가장 많이 등장한 문자 찾기 (사전순 우선)
            char selectedChar = 'A';
            int maxCount = a;
            if (c > maxCount) { selectedChar = 'C'; maxCount = c; }
            if (g > maxCount) { selectedChar = 'G'; maxCount = g; }
            if (t > maxCount) { selectedChar = 'T'; maxCount = t; }

            consensusDNA.append(selectedChar);
            hammingSum += (n - maxCount); // 다른 문자 개수만큼 Hamming Distance 증가
        }

        // 결과 출력
        System.out.println(consensusDNA);
        System.out.println(hammingSum);
    }
}
