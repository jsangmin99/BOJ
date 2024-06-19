class Solution {
    public String solution(int[] food) {
//        food 파이트 대회
        String answer = "";

        for(int i = 1 ; i < food.length; i++){
            if (food[i] % 2 == 0){
                food[i] = food[i] / 2;
            }else{
                food[i] = (food[i]-1) / 2;
            }
            for (int j = 0; j < food[i]; j++){
                answer += Integer.toString(i);
            }
        }
        answer += "0";
        for (int i = food.length-1; i > 0; i--) {
            for (int j = 0; j < food[i]; j++) {
                answer += Integer.toString(i);
            }
        }

        return answer;
    }
}