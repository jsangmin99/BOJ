import java.io.*;
import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int n = topping.length;
        Map<Integer, Integer> rightMap = new HashMap<>();
        for(int t : topping){
            rightMap.put(t, rightMap.getOrDefault(t, 0) +1);
        }
        Set<Integer> leftSet = new HashSet<>();

        int count = 0;
        for (int i = 0 ; i< n-1; i++){
            int current = topping[i];
            leftSet.add(current);

            rightMap.put(current, rightMap.get(current)-1);
            if (rightMap.get(current) == 0) {
                rightMap.remove(current);
            }

            if (leftSet.size() == rightMap.size()) {
                count++;
            }
        }


        return count;
    }
}