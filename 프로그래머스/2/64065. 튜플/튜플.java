import java.util.*;
class Solution {
    public int[] solution(String s) {
        
        s = s.substring(2, s.length() -2);
        String[] sets = s.split("\\},\\{");
        
        Arrays.sort(sets, Comparator.comparingInt(String::length));

        Set<String> seen = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();

        for (String set : sets) {
            for (String num : set.split(",")) {
                if (seen.add(num)) { // 새 원소일 경우만
                    resultList.add(Integer.parseInt(num));
                }
            }
        }
        
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
            
        return result;
    }
}