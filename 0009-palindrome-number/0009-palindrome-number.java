class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x %10 == 0 && x !=0)){
            return false;
        }

        int reservedHalf = 0;

        while (x > reservedHalf){
            reservedHalf = reservedHalf * 10 + x % 10;
            x /= 10;
        }

        return x == reservedHalf || x == reservedHalf /10;
    }
}