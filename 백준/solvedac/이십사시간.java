import java.io.*;
import java.util.*;

public class 이십사시간 {
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i = 1; i <= T; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int time = a+ b;
            System.out.println("#" + i + " " + time % 24);
        }
    }
    
}
