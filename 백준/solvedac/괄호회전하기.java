
import java.util.*;
public class 괄호회전하기 {
    public int solution(String s){
        int count =0;
        int n = s.length();
        for(int i = 0 ; i < n; i++){
            String rotate = s.substring(i) + s.substring(0, i);
            if (isValid(rotate)) {
                count++;
            }
        }
        return count;
    }

    private boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatch(top, c)) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }

    private boolean isMatch(char open, char close){
        return(open == '(' && close == ')') ||
            (open == '{' && close == '}') || 
            (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        괄호회전하기 r = new 괄호회전하기();
        System.out.println(r.solution("[](){}"));  // 3
        System.out.println(r.solution("}]()[{"));  // 2
        System.out.println(r.solution("[)(]"));    // 0
        System.out.println(r.solution("}}}"));     // 0    
    }
    
}
