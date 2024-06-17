import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        List<String> list = new ArrayList<>();
        for (int number : numbers) {
            list.add(String.valueOf(number));
        }
        list.sort((a,b) -> (b+a).compareTo(a+b));
        String answer = "";
        for (String s : list) {
            answer += s;
        }
        if(answer.charAt(0) == '0'){
            answer = "0";
        }
        return answer;
    }
}