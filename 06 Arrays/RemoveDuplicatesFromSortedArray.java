public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2, 3, 4, 4, 5 };
        Solution solution = new Solution();
        int newLength = solution.removeDuplicates(nums);

        System.out.println("New length of the array: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[idx] = nums[i];
                idx++;
            }
        }
        nums[idx++] = nums[nums.length - 1];

        return idx;
    }
}
