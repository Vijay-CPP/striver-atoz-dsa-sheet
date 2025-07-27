import java.util.*;

public class KadanesAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution1 solution = new Solution1();
        int maxSum = solution.maxSubArray(nums);

        System.out.println("Maximum subarray sum is: " + maxSum);
        sc.close();
    }
}

class Solution1 {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int res = Integer.MIN_VALUE;

        for (int ele : nums) {
            currSum += ele;
            res = Math.max(res, currSum);

            if (currSum < 0) {
                currSum = 0;
            }
        }

        return res;
    }
}

