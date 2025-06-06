import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());  
        int sum = 0;
        
        // 각 반사각도 받아서 합산
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            sum += tmp * 2;
        }

        int total = (n-1) * 180;

        int result = (total - sum);
        System.out.println(result);
    }
}
