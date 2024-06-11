import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion){
        Map<String, Integer> remainMap = new HashMap<>();
        for (String s : participant) {
            remainMap.put(s, remainMap.getOrDefault(s, 0) + 1);
        }
        for (String s : completion) {
            remainMap.put(s, remainMap.get(s) - 1);
        }
        String answer = "";
        for (String s : remainMap.keySet()) {
            if (remainMap.get(s) != 0) 
                answer = s;
        }
        return answer;
    }
}