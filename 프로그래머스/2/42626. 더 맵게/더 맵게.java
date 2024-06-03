import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue();
        for(int i : scoville){
            pq.add(i);
        }
        while (pq.size() >= 2 && pq.peek() < K) {
            int firstMin = pq.poll();
            int secondMin = pq.poll();
            pq.offer(firstMin + secondMin * 2);
            answer++;
        }
        
        return pq.peek() >= K ? answer : -1;
    }
}