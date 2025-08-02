import java.util.*;

public class TimesArrayIsRotated {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 0, 1, 2));

        Solution solution = new Solution();
        int result = solution.findKRotation(nums);

        System.out.println("Array is rotated " + result + " times.");
    }
}

class Solution {
    public int findKRotation(ArrayList<Integer> nums) {
        return findMin(nums);
    }

    public int findMin(ArrayList<Integer> nums) {
        int low = 0;
        int high = nums.size() - 1;

        int res = Integer.MAX_VALUE;
        int resIdx = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums.get(low) <= nums.get(mid)) {
                if (nums.get(low) < res) {
                    res = nums.get(low);
                    resIdx = low;
                }
                low = mid + 1;
            } else {
                if (nums.get(mid) < res) {
                    res = nums.get(mid);
                    resIdx = mid;
                }
                high = mid - 1;
            }
        }

        return resIdx;
    }
}
