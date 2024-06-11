import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> clothesMap = new HashMap<>();
        for (String[] s : clothes) {
            clothesMap.put(s[1], clothesMap.getOrDefault(s[1], 0) + 1);
        }
        for (String s : clothesMap.keySet()) {
            answer *= clothesMap.get(s) + 1;
        }
        return answer-1;
    }
}