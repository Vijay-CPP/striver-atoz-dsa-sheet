import java.util.*;

public class RearrangeArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution solution = new Solution();
        int[] rearrangedArray = solution.rearrangeArray(nums);

        System.out.println("Rearranged array:");
        for (int num : rearrangedArray) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

// using extra space
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int idx = 0;
        int posIdx = 0;
        int negIdx = 1;

        while (idx < n) {
            if (nums[idx] >= 0) {
                res[posIdx] = nums[idx];
                posIdx += 2;
            } else {
                res[negIdx] = nums[idx];
                negIdx += 2;
            }

            idx++;
        }

        return res;
    }
}
