class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
            long start = 0;
            long end = (long) times[times.length - 1] * n;
            while (start <= end){
                long mid = (start + end) / 2;
                long sum = 0;
                for (int time : times) {
                    sum += mid / time; // mid시간동안 가각 처리할수있는 수
                }
                if(sum >= n){
                    end = mid - 1;
                    answer = mid;
                }else{
                    start = mid + 1;
                }
            }
        
        return answer;
    }
}