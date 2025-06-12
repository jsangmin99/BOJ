import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        List<String> arr1 = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();

        for (int i = 0; i < str1.length() - 1; i++) {
            char a = str1.charAt(i);
            char b = str1.charAt(i + 1);
            if (Character.isLetter(a) && Character.isLetter(b)) {
                arr1.add(str1.substring(i, i + 2));
            }
        }

        for (int i = 0; i < str2.length() - 1; i++) {
            char a = str2.charAt(i);
            char b = str2.charAt(i + 1);
            if (Character.isLetter(a) && Character.isLetter(b)) {
                arr2.add(str2.substring(i, i + 2));
            }
        }
        if (arr1.isEmpty() && arr2.isEmpty()) {
            return 65536;
        }

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (String s : arr1) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }

        for (String s : arr2) {
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }

        int gyo = 0;
        int hap = 0;

        Set<String> set = new HashSet<>();

        set.addAll(map1.keySet());
        set.addAll(map2.keySet());

        for (String key : set) {
            int c1 = map1.getOrDefault(key, 0);
            int c2 = map2.getOrDefault(key, 0);

            gyo += Math.min(c1, c2);
            hap += Math.max(c1, c2);
        }
        answer = (int) (gyo * 65536.0 / hap);
        return answer;
    }
}