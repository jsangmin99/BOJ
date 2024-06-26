import java.util.*; 
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        for (int i = 0; i < people.length; i++) {
            if(left > right) break;

            if(people[left] + people[right] <= limit){
                left++;
            }
            right--;
            answer++;
        }
        return answer;
    }
}