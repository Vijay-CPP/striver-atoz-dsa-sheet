public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        Solution solution = new Solution();
        solution.moveZeroes(nums);

        System.out.print("Array after moving zeros: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        int n = nums.length;

        while (right < n) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
            }

            right++;
        }
    }
}