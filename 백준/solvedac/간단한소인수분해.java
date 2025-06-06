import java.io.*;
import java.util.*;

public class 간단한소인수분해 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());

        int[] primes = { 2, 3, 5, 7, 11 };

        for (int i = 1; i <= T; i++) {
            int n = Integer.parseInt(br.readLine());

            int[] counts = new int[5];

            for (int j = 0; j < primes.length; j++) {
                int prime = primes[j]; 
                
                while (n % prime == 0) {
                    n /= prime;
                    counts[j]++;
                }
            }

            System.out.print("#" + i + " ");
            for (int j = 0; j < counts.length; j++) {
                System.out.print(counts[j]);
                if (j < counts.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
