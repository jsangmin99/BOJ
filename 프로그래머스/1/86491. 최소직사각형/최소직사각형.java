import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0;
        int min = 0;
        for (int[] size : sizes) {
            Arrays.sort(size);
            max = Math.max(max, size[1]);
            min = Math.max(min, size[0]);
        }
        answer = max * min;


        return answer;
    }
}