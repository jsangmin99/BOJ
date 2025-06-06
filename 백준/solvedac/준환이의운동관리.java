import java.io.*;
import java.util.*;

public class 준환이의운동관리 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int testCase = 1; testCase <= T; testCase++) {
            st = new StringTokenizer(br.readLine());

            long L = Long.parseLong(st.nextToken());
            long U = Long.parseLong(st.nextToken());
            long X = Long.parseLong(st.nextToken());

            long result = 0;
            if (X > U) {
                result = -1;
            } else if (X < L) {
                result = L - X;
            }else{
                result = 0;
            }
            System.out.println("#" + testCase + " " + result);

        }

    }

}
