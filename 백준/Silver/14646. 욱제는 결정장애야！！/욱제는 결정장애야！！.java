import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] check = new boolean[n+1];
        int max = 0;
        int totalMax = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n * 2; i++) {
            int number = Integer.parseInt(st.nextToken());
            if (!check[number]) {
                max++;
                check[number] = true;
            }else{
                max--;
                check[number] = false;
            }
            totalMax = Math.max(totalMax, max);
        }
        System.out.println(totalMax);
    }

}
