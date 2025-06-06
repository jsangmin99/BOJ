import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int[] A = new int[N];

    A[0] = 1;
    A[1] = 2;

    for(int i = 2; i < N-1; i++){
      A[i] = A[i-1] +3;
    }

    int lastNumber = A[N-2] +1;
    while(!isPrime(lastNumber)){
      lastNumber++;
    }
    A[N-1] = lastNumber;
    System.out.println(N);

    for(int i = 0; i < N; i++){
      System.out.print(A[i] + " ");
    }

  }

  static boolean isPrime(int num){
    if(num < 2) return false;

    for (int i = 2; i * i <= num; i++){
      if(num % i ==0) return false;
    }
    return true;
  }
}