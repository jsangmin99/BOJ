import java.util.*;

public class Main{

    public static void main(String[] args) {
        int N, K;
        int sum =0;
        int max = -99999999;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < N-K+1; i++){
            sum = 0;
            for(int j = i; j < i+K; j++){
                sum += arr[j];
            }
            if(sum > max){
                max = sum;
            }

        }
        System.out.println(max);
    }
}
