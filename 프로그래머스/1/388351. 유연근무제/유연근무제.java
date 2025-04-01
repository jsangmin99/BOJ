class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int timelogMember = timelogs.length;
        
        //boolean[][] checkLate = new boolean[timelogMember][7];
        
        for(int i = 0 ; i < timelogMember; i++){
            int count = 0; // 정상 출근한 날 카운트
            int hour = schedules[i] / 100;
            int minute = schedules[i] % 100;
            minute += 10;

            if (minute >= 60) { // 60분을 넘어가면 시간 증가
                hour += 1;
                minute -= 60;
            }
            int allowedTime = hour * 100 + minute;
            
            for(int j = 0; j < 7; j++){
                int day = (startday + j - 1) % 7 + 1;
                
                if(day == 6 || day ==7){
                    continue;
                }
                if(timelogs[i][j] <= allowedTime){
                    // checkLate = true;
                    count++;
                }
            }
            if(count >= 5){
                answer++;
            }
        }
        
        
        
        
        return answer;
    }
}