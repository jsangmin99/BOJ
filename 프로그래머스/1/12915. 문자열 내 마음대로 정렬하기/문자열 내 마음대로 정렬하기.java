import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        Map<String, String> treeMap2 = new TreeMap<>();
        for(String s : strings){
            treeMap2.put(s.substring(n, n+1) + s, s);
        }
        String [] answer = new String[strings.length];
        answer = treeMap2.values().toArray(answer);
        return answer;
    }
}