import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Deque<String> deque1 = new ArrayDeque<>();
        Deque<String> deque2 = new ArrayDeque<>();

        for (String card : cards1) {
            deque1.add(card);
        }
        for (String card : cards2) {
            deque2.add(card);
        }
        for (String word : goal) {
            if (!deque1.isEmpty() && deque1.peek().equals(word)) {
                deque1.poll();
            } else if (!deque2.isEmpty() && deque2.peek().equals(word)) {
                deque2.poll();
            } else {
                answer = "No";
                break;
            }
        }

        return answer;
    }
}