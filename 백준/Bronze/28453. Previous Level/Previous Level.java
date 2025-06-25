import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a == 300) {
                results.add(1);
            } else if (a >= 275) {
                results.add(2);
            } else if (a >= 250) {
                results.add(3);
            } else {
                results.add(4);
            }

        }

        for (int i : results) {
            System.out.print(i + " ");
        }
    }
}