import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> st4 = new Stack<>();
        boolean answer = true;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                st4.push(c);
            } else {
                if (st4.isEmpty()) {
                    answer = false;
                    break;
                }
                st4.pop();
            }
        }
        if (!st4.isEmpty()) {
            answer = false;
        }
        return answer;
    }
}