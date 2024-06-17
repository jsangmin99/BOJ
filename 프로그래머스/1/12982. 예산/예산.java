import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        for (int j : d) {
            sum += j;
            if (budget >= sum) {
                answer++;
            }
        }
        return answer;
    }
}