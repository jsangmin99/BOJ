import java.util.*;
    class Solution{
        public int[] solution(int[] nums, int target) {
            int[] answer = {};
            List<int[]> list = new ArrayList<>();
            int start = 0;
            int end = 0;
            int sum = nums[0];

            while (start <= end && end < nums.length) {
                if(sum == target){
                    list.add(new int[]{start, end});
                    sum -= nums[start];
                    start++;
                }
                else if(sum < target && end < nums.length-1){
                    end++;
                    sum += nums[end];
                }else{
                    sum -= nums[start];
                    start++;
                }
            }

            list.sort(new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return (o1[1] - o1[0]) - (o2[1] - o2[0]);
                }
            });
            answer = list.get(0);

            return answer;
        }
    }