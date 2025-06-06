import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int totalStudent = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int rank = Integer.parseInt(st.nextToken());
            int p = rank * 100 / totalStudent;
            if (0 <= p && p <= 4) {
                sb.append("1 ");
            } else if (4 < p && p <= 11) {
                sb.append("2 ");
            } else if (11 < p && p <= 23) {
                sb.append("3 ");
            } else if (23 < p && p <= 40) {
                sb.append("4 ");
            } else if (40 < p && p <= 60) {
                sb.append("5 ");
            } else if (60 < p && p <= 77) {
                sb.append("6 ");
            } else if (77 < p && p <= 89) {
                sb.append("7 ");
            } else if (89 < p && p <= 96) {
                sb.append("8 ");
            } else if (96 < p && p <= 100) {
                sb.append("9 ");
            }
        }
        System.out.println(sb.toString());

    }

}
