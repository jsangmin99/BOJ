import java.util.*;
class Solution {
    public String solution(String s) {
        String[] sList = s.split(" ");
        List<Integer> list = new ArrayList<>();
        for(String str : sList){
            list.add(Integer.parseInt(str));
        }
        //오름차순
        list.sort((a,b) -> a-b);
        String answer = list.get(0) + " " + list.get(list.size()-1);
        return answer;
    }
}