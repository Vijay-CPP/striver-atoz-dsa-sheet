import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution1 solution = new Solution1();
        int result = solution.longestConsecutive(nums);

        System.out.println("Length of the longest consecutive sequence: " + result);
        sc.close();
    }
}

class Solution1 {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int res = 1;
        int count = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }

            if (nums[i + 1] - nums[i] == 1) {
                count++;
                res = Math.max(res, count);
            } else {
                count = 1;
            }
        }

        return res;
    }
}

class Solution2 {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;

        HashSet<Integer> set = new HashSet<>();

        for (int ele : nums)
            set.add(ele);

        int res = 0;

        for (int ele : set) {
            if (!set.contains(ele - 1)) {
                int count = 1;
                int currNum = ele;
                while (set.contains(currNum + 1)) {
                    count++;
                    currNum++;
                }
                res = Math.max(res, count);
            }
        }

        return res;
    }
}