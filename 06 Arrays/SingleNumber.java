public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        Solution solution = new Solution();
        int result = solution.singleNumber(nums);
        System.out.println("Single number in the array: " + result);
    }    
}

class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int val : nums){
            res = res ^ val;
        }
        return res;
    }
}
