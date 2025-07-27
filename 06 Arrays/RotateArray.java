public class RotateArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3; // Number of positions to rotate
        Solution solution = new Solution();
        solution.rotate(nums, k);

        System.out.print("Array after rotation: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }    
}

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[(i + k) % n] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = res[i];
        }
    }
}
