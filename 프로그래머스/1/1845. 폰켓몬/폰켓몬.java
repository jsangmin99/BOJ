import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Set<String> mySet2 = new HashSet<>();
        for (int num : nums) {
            mySet2.add(String.valueOf(num));
        }
        int answer = Math.min(mySet2.size(), nums.length / 2);
        return answer;
    }
}