package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 트리만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int cnt = 0;
        int node = 0;
        if(m == 2){
            cnt = 1;
        }

        for(int i=1; i<n; i++){
            if(m > cnt) {
                sb.append("0").append(" ").append(i).append("\n");
                cnt++;
            }
            else{
                sb.append(node).append(" ").append(i).append("\n");
            }
            node = i;
        }

        System.out.println(sb);
    }
}
