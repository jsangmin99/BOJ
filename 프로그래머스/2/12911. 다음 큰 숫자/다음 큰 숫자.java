class Solution {
    public int solution(int n) {
            int answer = 0;
            int count = 0;
            String binary = Integer.toBinaryString(n);
            for(int i = 0; i < binary.length(); i++){
                if(binary.charAt(i) == '1'){
                    count++;
                }
            }
            while (true){
                n++;
                int temp = 0;
                String tempBinary = Integer.toBinaryString(n);
                for(int i = 0; i < tempBinary.length(); i++){
                    if(tempBinary.charAt(i) == '1'){
                        temp++;
                    }
                }
                if(count == temp){
                    answer = n;
                    break;
                }
            }
            
            return answer;
        }
    }
