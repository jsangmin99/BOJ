import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int[] tmp = new int[numbers.length * numbers.length];

        int count = 0;

        for(int i = 0; i < numbers.length; i++){
            for (int j = i+1; j < numbers.length; j++){
                tmp[count] = numbers[i] + numbers[j];
                count++;
            }
        }
        tmp = Arrays.copyOf(tmp, count);
        int[] newtmp = new int[tmp.length];
        Arrays.sort(tmp);
        int num = 0;
        for(int i = 0; i < tmp.length; i++){
            if(i == 0 || tmp[i] != tmp[i-1]){
                newtmp[num] = tmp[i];
                num++;
            }
        }
        answer = Arrays.copyOfRange(newtmp, 0, num);
    


        return answer;
    }
}