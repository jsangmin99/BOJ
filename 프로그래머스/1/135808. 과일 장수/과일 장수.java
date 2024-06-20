import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> myList = new ArrayList<>();
        for (int j : score) {
            myList.add(j);
        }
        myList.sort(Collections.reverseOrder());
        for(int i = 0 ; i < myList.size()/m; i++) {
            answer += myList.get((i+1)*m-1)*m;
        }

        return answer;
    }
}