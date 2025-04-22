import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i == n - 1 && n % 2 == 1) {
                sb.append("3"); // 홀수라면 마지막만 3으로
            } else {
                sb.append((i % 2) + 1).append(" "); // 1 2 반복
            }
        }

        System.out.println(sb.toString().trim());
    }
}
