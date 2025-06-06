import java.util.*;
import java.io.*;

public class 뷰 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= 10; tc++) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            int total = 0;

            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for(int i = 2; i < n-2; i++){
                int now = arr[i];
                int l1 = arr[i-2];
                int l2 = arr[i-1];
                int r1 = arr[i+1];
                int r2 = arr[i+2];
                int maxH = Math.max(Math.max(l1,l2), Math.max(r1,r2));
                if(now > maxH){
                    total += now - maxH; 
                }
            }
            System.out.println("#" + tc + " " + total);
        }
    }
}
