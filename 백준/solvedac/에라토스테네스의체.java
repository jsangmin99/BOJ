import java.io.*;
import java.util.*;

public class 에라토스테네스의체 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 최댓값 N
        int K = sc.nextInt();  // K번째로 지워지는 수
        
        boolean[] isPrime = new boolean[N + 1];

        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        int count = 0;  

        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i; j <= N; j += i) {
                    if (isPrime[j]) {
                        isPrime[j] = false;  
                        count++;             

                        if (count == K) {
                            System.out.println(j);
                            return;
                        }
                    }
                }
            }
        }
    }
    
}
