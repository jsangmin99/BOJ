import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int d = gcd(a, b);
			
			sb.append(a * b / d).append('\n');
		}
		System.out.println(sb);
 
	}

    public static int gcd(int a, int b){
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}