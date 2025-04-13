import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0 ; i < priorities.length; i++){
            queue.add(new int[] {i, priorities[i]});
        }

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            boolean hasHigherPriority = false;

            // 현재 큐에 더 높은 우선순위가 있는지 확인
            for (int[] process : queue) {
                if (process[1] > current[1]) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                // 현재 프로세스를 다시 큐의 끝에 넣음
                queue.add(current);
            } else {
                // 현재 프로세스 실행
                answer++;
                if (current[0] == location) {
                    return answer;
                }
            }
        }

        return answer;
    }
}