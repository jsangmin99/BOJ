class Solution {
    public int[] solution(String s) {
        int[] answer = {};
            int changeCount = 0;
            int zeroCount = 0;
            while (true){
                if(s.equals("1")){
                    break;
                }
                int one = 0;
                for(int i = 0; i < s.length(); i++){
                    if(s.charAt(i) == '0'){
                        zeroCount++;
                    }else{
                        one++;
                    }
                }
                s = Integer.toBinaryString(one);
                changeCount++;
            }
            answer = new int[]{changeCount, zeroCount};
            return answer;
    }
}