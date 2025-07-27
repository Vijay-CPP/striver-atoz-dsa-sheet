import java.util.*;

class TwoSum{
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Solution1 solution = new Solution1();
        int[] result = solution.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices of the two numbers that add up to " + target + ": " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers add up to " + target);
        }
    }
}

// TwoSum solution using a HashMap
class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }
}

// Alternative solution using sorting
class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[][] numsIdx = new int[n][2];

        for(int i=0; i<nums.length; i++){
            numsIdx[i][0] = nums[i];
            numsIdx[i][1] = i;
        }

        Arrays.sort(numsIdx, (a, b) -> Integer.compare(a[0], b[0]));

        int start = 0;
        int end = n - 1;

        while(start < end){
            int sum = numsIdx[start][0] + numsIdx[end][0];
            if(sum == target){
                return new int[]{numsIdx[start][1], numsIdx[end][1]};
            }
            else if(sum > target){
                end--;
            }
            else{
                start++;
            }
        }

        return new int[]{};
    }
}