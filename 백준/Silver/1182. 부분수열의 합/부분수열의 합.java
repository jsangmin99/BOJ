import java.util.*;

public class Main{
    static int N,S,cnt=0;
    static int[] arr;
    
    
    static void dfs(int depth, int sum) {
        if(depth==N) {
            if(sum==S)	cnt++;
            return;
        }
        dfs(depth+1,sum+arr[depth]);
        dfs(depth+1,sum);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();	
        S = sc.nextInt();	
        arr = new int[N];	

        for(int i=0;i<N;i++)
            arr[i]=sc.nextInt();

        dfs(0,0);
        if(S==0)	
            cnt-=1;
        System.out.println(cnt);

    }
    
}
