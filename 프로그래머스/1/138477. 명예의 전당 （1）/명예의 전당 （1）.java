import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Integer> list = new ArrayList<>();
        for(int i : score){
            pq.add(i);
            if(pq.size() > k) {
                pq.poll();
            }
            list.add(pq.peek());
        }
        return list.stream().mapToInt(i -> i).toArray();
        }
}