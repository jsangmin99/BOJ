import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
                Set<Integer> answerSet = new TreeSet<>();
        for(int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++){
                answerSet.add(numbers[i] + numbers[j]);
            }
        }
        int result[] = new int[answerSet.size()];
        int index = 0;
        for (int num : answerSet) {
            result[index++] = num;
        }
        return result;
    }
}