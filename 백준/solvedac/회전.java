import java.io.*;
import java.util.*;

public class 회전 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i< T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] arr = new int[n];

            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                arr[j] = Integer.parseInt(st.nextToken());                
            }
            int pointer = m % n;

            System.out.println("#" + (i+1) + " " + arr[pointer]);
        }

        
    }
    
}
