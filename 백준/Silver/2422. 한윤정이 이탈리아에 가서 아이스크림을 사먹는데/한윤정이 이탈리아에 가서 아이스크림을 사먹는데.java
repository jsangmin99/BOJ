import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[][] notMix = new boolean[n+1][n+1];

        for(int i = 0; i< m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            notMix[a][b] = true;
            notMix[b][a] = true;
        }
        
        int count = 0;
        for(int i = 1; i <= n; i++){
            for(int j = i+1; j <= n; j++){
                for(int k = j+1; k <= n; k++){
                    if (!notMix[i][j] && !notMix[j][k] && !notMix[i][k]) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    
}
