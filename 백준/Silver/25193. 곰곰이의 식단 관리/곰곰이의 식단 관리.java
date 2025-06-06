import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'C')
                cnt++;
        }
        
        int result = cnt / (n - cnt + 1) + (cnt % (n - cnt + 1) != 0 ? 1 : 0);

        System.out.println(result);
    }
}
