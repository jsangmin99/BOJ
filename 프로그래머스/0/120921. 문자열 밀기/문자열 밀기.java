class Solution {
    public int solution(String A, String B) {
        int length = A.length();
        if (A.equals(B)) {
            return 0;
        }
        
        String s = A;
        for (int i = 1; i < length; i++) {
            s = s.substring(length - 1) + s.substring(0, length - 1);
            if (s.equals(B)) {
                return i;
            }
        }
        
        return -1;
    }
}
