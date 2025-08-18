import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int a = 100 - A;
        int b = 100 - B;
        int c = 100 - (a + b);
        int d = a * b;

        int q = d / 100;
        int r = d % 100;

        int front = (q + c);
        int back = r;

        System.out.println(a + " " + b + " " + c + " " + d + " " + q + " " + r);
        System.out.println(front + " " + back);

    }

}
