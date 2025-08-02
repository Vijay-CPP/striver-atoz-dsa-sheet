public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = { 3, 0, 1 };

        Solution solution = new Solution();
        int missingNumber = solution.missingNumber(nums);

        System.out.println("The missing number is: " + missingNumber);
    }
}

class Solution {
    public int missingNumber(int[] nums) {
        long sum = 0;
        long n = nums.length;

        for (int val : nums)
            sum += val;

        return (int) ((n * (n + 1)) / 2 - sum);
    }
}
