import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
            long answer = 0;
            Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
            for (int work : works) {
                queue.add(work);
            }
            for (int i = 0; i < n; i++) {
                if (queue.isEmpty()) {
                    break;
                }
                int max = queue.poll();
                if (max == 0) {
                    break;
                }
                queue.add(max - 1);
            }
            while (!queue.isEmpty()) {
                answer += Math.pow(queue.poll(), 2);
            }
            return answer;
    }
}