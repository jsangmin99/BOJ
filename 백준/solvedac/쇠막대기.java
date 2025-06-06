import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 쇠막대기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Stack<Character> stack = new Stack<>();

        int result = 0;
        // ( = 쇠막대기 시작 stack에 push
        // ) =
        // 직전이 ( 면 레이저 -> stack.pop()
        // 직전이 ) 면 막대기 끝 -> stack.pop() + 조각수 ++

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push('(');
            } else if (ch == ')') {
                stack.pop();
                if (s.charAt(i - 1) == '(') {
                    result += stack.size();
                }else{
                    result++;
                }
            }
        }
        System.out.println(result);

    }

}
