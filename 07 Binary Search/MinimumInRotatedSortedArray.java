public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[] { 4, 5, 6, 7, 0, 1, 2 };

        Solution solution = new Solution();
        int result = solution.findMin(nums);

        System.out.println("Minimum element in rotated sorted array: " + result);
    }    
}

class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        int res = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If left half is sorted
            if (nums[low] <= nums[mid]) {
                res = Math.min(res, nums[low]);
                low = mid + 1;
            } else {
                res = Math.min(res, nums[mid]);
                high = mid - 1;
            }
        }

        return res;
    }
}

