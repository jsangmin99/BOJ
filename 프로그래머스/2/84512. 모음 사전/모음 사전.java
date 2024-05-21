import java.util.*;
class Solution {
        public int solution(String word) {
        int answer = 0;
        Map<Character, Integer> alpa = new HashMap<>();
        int[] nextWord = { 781, 156, 31, 6, 1 };

        alpa.put('A', 0);
        alpa.put('E', 1);
        alpa.put('I', 2);
        alpa.put('O', 3);
        alpa.put('U', 4);

        int i = 0;
        for (char w : word.toCharArray()) {
            answer += 1 + alpa.get(w) * nextWord[i];
            i++;
        }

        return answer;
    }
}