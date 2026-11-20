
class Solution {
    public boolean isPossible(int[] nums) {

        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> end = new HashMap<>();

        // Step 1: Count frequency of each number
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // Step 2: Try to form valid sequences
        for (int num : nums) {

            if (count.get(num) == 0) {
                continue;
            }

            // Use this number
            count.put(num, count.get(num) - 1);

            // Case 1: Extend an existing sequence
            if (end.getOrDefault(num - 1, 0) > 0) {
                end.put(num - 1, end.get(num - 1) - 1);
                end.put(num, end.getOrDefault(num, 0) + 1);
            }
            // Case 2: Start a new sequence of length 3
            else if (count.getOrDefault(num + 1, 0) > 0 &&
                     count.getOrDefault(num + 2, 0) > 0) {

                count.put(num + 1, count.get(num + 1) - 1);
                count.put(num + 2, count.get(num + 2) - 1);
                end.put(num + 2, end.getOrDefault(num + 2, 0) + 1);
            }
            // Case 3: Impossible
            else {
                return false;
            }
        }

        return true;
    }
}