import java.util.*;
import java.io.*;

public class 성적표 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] x = new int[n];
        int[] y = new int[n];

        StringTokenizer st;
        for(int i = 0 ; i < n; i++){
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        long minRss = Long.MAX_VALUE;
        int bestA = 0;
        int bestB = 0;

        for(int a = 1; a <= 100; a++){
            for(int b = 1; b <=100; b++){
                long rss =0;
                for(int i = 0; i < n; i++){
                    long fx = a * x[i] +b;
                    long diff = y[i] -fx;
                    rss += diff * diff;
                }
                if (rss < minRss){
                    minRss = rss;
                    bestA = a;
                    bestB = b;
                }
            }
        }
        System.out.println(bestA + " " + bestB);
    }
    
}
