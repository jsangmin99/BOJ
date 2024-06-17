import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
//        백준 부분수열의 합 1182
//        스캐너 말고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int result = 0;
        for(int i = 1; i<(1<<n); i++){
            int sum = 0;
            for(int j = 0; j<n; j++){
                if((i & (1<<j)) != 0){
                    sum += arr[j];
                }
            }
            if(sum == s){
                result++;
            }
        }
        System.out.println(result);

    }
}
