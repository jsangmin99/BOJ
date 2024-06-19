import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        Map<Character, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int index = map.get(s.charAt(i));
                map.put(s.charAt(i), i);
                list.add(i - index);
            } else {
                map.put(s.charAt(i), i);
                list.add(-1);
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}