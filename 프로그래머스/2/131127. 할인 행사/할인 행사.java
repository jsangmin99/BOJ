import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0; 
//         1. 슬라이딩 윈도우 방식으로 discount 확인 10개씩
//         2. 윈도우 안에 want 가 있으면 count++ 해서 numㅠer의 갯수 이상이면 result++;
        Map<String, Integer> wantMap = new HashMap<>();
        
        for(int i = 0; i < want.length; i++){
            wantMap.put(want[i], number[i]);
        }
        
        for(int i  = 0; i <= discount.length - 10; i++){
            Map<String, Integer> discountMap = new HashMap<>();
            for(int j = i; j < i+10; j++){
                discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
            }
            if(isSame(wantMap, discountMap)){
                answer++;
            }
            
        }
        return answer;
    }
    
    private boolean isSame(Map<String, Integer> wantMap, Map<String, Integer> discountMap){
        for (String item : wantMap.keySet()) {
            if (discountMap.getOrDefault(item, 0) < wantMap.get(item)) {
                return false;
            }
        }
        return true;
    }
}