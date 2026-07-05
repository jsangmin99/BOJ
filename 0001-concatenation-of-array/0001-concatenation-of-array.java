class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] num = new int [nums.length * 2];

        for(int i = 0; i < nums.length; i++){
            num[i] = nums[i];
            num[nums.length + i] = nums[i];
        }
        return num;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna