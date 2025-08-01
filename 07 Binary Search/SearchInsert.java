public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 3, 5, 6 };
        int target = 5;

        Solution solution = new Solution();
        int result = solution.searchInsert(nums, target);

        System.out.println("Insert position for " + target + ": " + result);
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        return this.lowerBound(nums, target);
    }

    public int lowerBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int result = nums.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                result = mid;
                high = mid - 1;
            }
        }

        return result;
    }
}
