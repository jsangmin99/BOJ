import java.util.*;
class Solution{
    public int solution(int[][] jobs){
            int answer = 0;
            int time = 0;
            int count = 0;
            PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
            // 요청시간 순으로 정렬
            PriorityQueue<int[]> requestPq = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
            Collections.addAll(requestPq, jobs);
            
            while(count < jobs.length){
                while(!requestPq.isEmpty() && requestPq.peek()[0] <= time){
                    pq.add(requestPq.poll());
                }
                if(pq.isEmpty()){
                    time = Objects.requireNonNull(requestPq.peek())[0];
                }else{
                    int[] temp = pq.poll();
                    time += temp[1];
                    answer += time - temp[0];
                    count++;
                }
            }
            
            answer /= jobs.length;
            return answer;
        }
}