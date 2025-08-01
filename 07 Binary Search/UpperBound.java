public class UpperBound {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 4, 4, 5, 6 };
        int target = 4;

        Solution solution = new Solution();
        int result = solution.upperBound(nums, target);

        System.out.println("Upper bound index for " + target + ": " + result);
    }
}

class Solution {
    public int upperBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int result = nums.length; // Default to length if not found

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                result = mid;
                high = mid - 1;
            }
        }

        return result;
    }
}