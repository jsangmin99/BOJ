import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> resultList = new ArrayList<>();
        for(int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                resultList.add(numlist[i]);
            }
        }
        int[] answer = new int[resultList.size()];
        for(int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        
        return answer;
    }
}
