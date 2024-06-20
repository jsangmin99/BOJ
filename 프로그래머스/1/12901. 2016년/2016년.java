class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        2016년 1월 1일은 금요일입니다
        for (int i = 0; i < a - 1; i++) {
            b += month[i]; 
        }
        answer = days[(b + 4) % 7]; 

        return answer;
    }
}