public class FirstAndLastPos {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;

        Solution solution = new Solution();
        int[] result = solution.searchRange(nums, target);

        System.out.println("First and last position of " + target + ": [" + result[0] + ", " + result[1] + "]");
    }
}

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = lowerBound(nums, target);
        int end = upperBound(nums, target) - 1;

        if (start == nums.length || nums[start] != target) {
            return new int[] { -1, -1 };
        }

        return new int[] { start, end };
    }

    public int lowerBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int result = nums.length; // Default to length if not found

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
