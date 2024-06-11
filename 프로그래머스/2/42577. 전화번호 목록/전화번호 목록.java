import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
                Set<String> mySet3 = new HashSet<>(Arrays.asList(phone_book));
        boolean answer  = true;
        for (String s : phone_book){
            for(int i = 0; i < s.length(); i++){
                if(mySet3.contains(s.substring(0, i))){
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
}