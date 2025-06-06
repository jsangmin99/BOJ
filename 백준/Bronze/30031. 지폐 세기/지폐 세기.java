import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int total = 0;
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int wide = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            if (wide == 136)
                total += 1000;
            if (wide == 142)
                total += 5000;
            if (wide == 148)
                total += 10000;
            if (wide == 154)
                total += 50000;

        }
        System.out.println(total);
    }

}
