public class SingleElementInASortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};

        Solution solution = new Solution();
        int result = solution.singleNonDuplicate(nums);

        System.out.println("The single element in the sorted array is: " + result);
    }
}

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        // Edge cases
        if (n == 1)
            return nums[0];
        if (nums[0] != nums[1])
            return nums[0];
        if (nums[n - 1] != nums[n - 2])
            return nums[n - 1];

        int low = 1;
        int high = n - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is the desired answer
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            // we are in the left:
            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                //eliminate the left half: 
                low = mid + 1;
            }
            //we are in the right:
            else {
                //eliminate the right half:
                high = mid - 1;
            }
        }

        // dummy return statement:
        return -1;
    }
}