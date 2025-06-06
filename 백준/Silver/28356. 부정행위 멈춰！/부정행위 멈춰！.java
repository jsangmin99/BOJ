import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int paperKind = 4;

        if (n == 1 || m == 1)
            paperKind = 2;
        if (n == 1 && m == 1)
            paperKind = 1;

        bw.write(paperKind + "\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int paper = (i % 2) * 2 + (j % 2) + 1;
                if (paperKind == 2) {
                    paper = (i + j) % 2 + 1;
                } else if (paperKind == 1) {
                    paper = 1;
                }
                bw.write(paper + (j == m - 1 ? "\n" : " "));
            }
        }
        br.close();
        bw.close();
    }

}
