import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int [] temp_arr = {};
        for(int i = 0 ; i < commands.length; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];
            temp_arr = Arrays.copyOfRange(array, start-1, end);                   Arrays.sort(temp_arr);
            answer[i] = temp_arr[k-1];
        }

        return answer;
    }
}