public class CountOccuranceInSortedArray {
    
}

class Solution{
    public int countOccurrences(int[] nums, int target) {
        int first = lowerBound(nums, target);
        int last = upperBound(nums, target) - 1;

        if (first == nums.length || nums[first] != target) {
            return 0; // Target not found
        }

        return last - first + 1; // Count of occurrences
    }

    private int lowerBound(int[] nums, int target) {
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

    private int upperBound(int[] nums, int target) {
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
