import java.util.*;
import java.io.*;

public class 점심시간레이스 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int minTime = Integer.MAX_VALUE;
        int resultBan = Integer.MAX_VALUE;

        for(int i = 1; i <= k; i++){
            st = new StringTokenizer(br.readLine());

            int floor = Integer.parseInt(st.nextToken());
            int ban = Integer.parseInt(st.nextToken());

            int time = (floor - 1) + (m - ban) + 1;

            if(time < minTime || (time == minTime && i < resultBan)){
                minTime = time;
                resultBan = i;
            }
        }
        System.out.println(resultBan);
    }
}