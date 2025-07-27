import java.util.HashMap;

public class MajorityElement1 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 }; // Example input
        Solution1 solution1 = new Solution1();
        System.out.println("Majority Element (using HashMap): " + solution1.majorityElement(nums));

        Solution2 solution2 = new Solution2();
        System.out.println("Majority Element (using Boyer-Moore Voting Algorithm): " + solution2.majorityElement(nums));
    }
}

class Solution1 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        for (Integer key : map.keySet()) {
            if (Math.floor(map.get(key)) > (n / 2)) {
                return key;
            }
        }

        return 0;
    }
}

class Solution2 {
    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0;
        // Boyer-Moore Voting Algorithm

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}