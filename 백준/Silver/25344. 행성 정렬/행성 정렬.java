import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int i = 1; i < n - 2; i++) {
            int nextT = Integer.parseInt(st.nextToken());
            T = lcm(T, nextT);
        }
        System.out.println(T);

    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b; //오버플로우를 막기위해 나누기 먼저 계산
    }

}

