import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
            int[] answer = {};
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            List<Integer> list = new ArrayList<>();

            for(int i = 0 ; i < score.length; i++) {
                int temp = 0;
                pq.add(score[i]);

                if(pq.size() > k){
                    pq.remove();
                    list.add(pq.peek());
                }else{
                    list.add(pq.peek());
                }
            }
            answer = list.stream().mapToInt(i -> i).toArray();
            return answer;
        }
}