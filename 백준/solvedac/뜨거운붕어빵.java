package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.StringTokenizer;

public class 뜨거운붕어빵 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        Stack<Character> stack = new Stack<>();
//
//        for (int i = 0; i < n; i++) {
//            String s = br.readLine();
//            for (int j = 0; j < m; j++) {
//                stack.add(s.charAt(j));
//            }
//            for (int j = 0; j < m; j++) {
//                System.out.print(stack.pop());
//            }
//            System.out.println();
//        }
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringBuilder[] result = new StringBuilder[N];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            result[i] = new StringBuilder(line).reverse();
        }

        for (int i = 0; i < N; i++) {
            System.out.println(result[i]);
        }
    }
}
