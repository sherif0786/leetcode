class Solution {
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums); // O(n log n)
        
        for (int i = n - 1; i >= 2; i--) {
            int a = nums[i], b = nums[i - 1], c = nums[i - 2];
            if (b + c > a) return a + b + c;
        }
        return 0;
    }
}