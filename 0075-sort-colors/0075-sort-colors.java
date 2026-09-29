class Solution {
    public void sortColors(int[] nums) {
        int zero = 0, one = 0, two = 0;

        // Step 1: Count how many 0s, 1s, and 2s
        for (int num : nums) {
            if (num == 0) zero++;
            else if (num == 1) one++;
            else two++;
        }

        // Step 2: Rewrite the array
        int i = 0;
        while (zero-- > 0) nums[i++] = 0;
        while (one-- > 0) nums[i++] = 1;
        while (two-- > 0) nums[i++] = 2;
    }
}