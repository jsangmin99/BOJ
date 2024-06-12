import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0 ; i < progresses.length; i++){
            int remain = 100 - progresses[i];
            int day = remain / speeds[i];
            if(remain % speeds[i] != 0){
                day++;
            }
            queue.add(day);
        }
        int count = 1;
        int day = queue.poll();

        while(!queue.isEmpty()){
            int nextDay = queue.poll();
            if(day >= nextDay){
                count++;
            }else{
                if(answer == null){
                    answer = new int[1];
                    answer[0] = count;
                }else{
                    int[] temp = new int[answer.length + 1];
                    for(int i = 0; i < answer.length; i++){
                        temp[i] = answer[i];
                    }
                    temp[answer.length] = count;
                    answer = temp;
                }
                count = 1;
                day = nextDay;
            }
        }
        if(answer == null){
            answer = new int[1];
            answer[0] = count;
        }else{
            int[] temp = new int[answer.length + 1];
            for(int i = 0; i < answer.length; i++){
                temp[i] = answer[i];
            }
            temp[answer.length] = count;
            answer = temp;
        }
        
        return answer;
    }
}