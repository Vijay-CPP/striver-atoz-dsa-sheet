import java.util.*;

class SubArraySumEqualK {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        int k = 2;
        Solution solution = new Solution();
        int result = solution.subarraySum(nums, k);
        System.out.println("Number of subarrays with sum equal to " + k + ": " + result);
    }
}

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int res = 0;
        map.put(0, 1);
        for(int ele : nums){
            sum += ele;
            if(map.containsKey(sum - k)){
                res += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return res;
    }
}