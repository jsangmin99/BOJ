import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0) return 5 * cities.length;
        LinkedList<String> cache = new LinkedList<>();
        int time = 0;
        int n = cities.length;
        
        for (String city : cities) {
            String cityLower = city.toLowerCase();
            if(cache.contains(cityLower)){
                time++;
                cache.remove(cityLower);
                cache.addLast(cityLower);
            }else{
                if (cache.size() >= cacheSize) {
                    cache.removeFirst();
                }
                cache.addLast(cityLower);
                time += 5;
            }
        }
        return time;
    }
}