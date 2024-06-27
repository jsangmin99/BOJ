class Solution {
        public int solution(int n) {
            int answer = 0;
            int start = 1;
            int end = 1;
            int sum = 0;
            while (start <= n){
                if(sum < n){
                    sum += end++;
                }else if(sum > n){
                    sum -= start++;
                }else{
                    answer++;
                    sum -= start++;
                }
            }
            return answer;
        }
}