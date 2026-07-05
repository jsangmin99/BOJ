class Solution {
    public boolean isAnagram(String s, String t) {
        // 1. 글자수 다른지 확인
        if(s.length() != t.length()){
            return false;
        }

        // 1. HASHMAP으로 빈도수 확인
        Map<Character, Integer> charCounts = new HashMap<>();
        for(int i = 0 ; i < s.length(); i++){
            char chars = s.charAt(i);
            char chart = t.charAt(i);

            charCounts.put(chars, charCounts.getOrDefault(chars, 0) +1);
            charCounts.put(chart, charCounts.getOrDefault(chart, 0) - 1);
        }
        for(int count : charCounts.values()){
            if(count != 0){
                return false;
            }
        }
        return true;
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna