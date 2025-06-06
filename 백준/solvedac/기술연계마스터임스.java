package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 기술연계마스터임스 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        Stack<Character> L_stack = new Stack<>();
        Stack<Character> S_stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                count++;
            } else if (ch == 'L') {
                L_stack.push('L');
            } else if (ch == 'S') {
                S_stack.push('S');
            } else if (ch == 'R') {
                if (!L_stack.isEmpty()) {
                    L_stack.pop();
                    count++;
                }else {
                    break;
                }
            } else if (ch == 'K') {
                if (!S_stack.isEmpty()) {
                    S_stack.pop();
                    count++;
                }else {
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
