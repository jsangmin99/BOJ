import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        StringBuilder[] result = new StringBuilder[N]; 
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            result[i] = new StringBuilder(line).reverse(); 
        }

        for (int i = 0; i < N; i++) {
            System.out.println(result[i]);
        }
    }
}
