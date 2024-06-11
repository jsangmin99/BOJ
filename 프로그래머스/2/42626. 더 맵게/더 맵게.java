import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        for(int i : scoville){
            pq2.add(i);
        }
        while (pq2.size() >= 2 && pq2.peek() < K){
            int first = pq2.poll();
            int second = pq2.poll();
            pq2.add(first + (second * 2));
            answer ++;
        }
        return pq2.peek() >= K ? answer : -1;
    }
}