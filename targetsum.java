class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int s = 0; // sum
        return sum(0, s, target, nums);
    }

    public static int sum(int n, int s, int tar, int[] nums) {

        // goal
        if (n == nums.length) {
            if (s == tar) {
                return 1;
            }
            return 0;

        }

        int pos = sum(n + 1, s + nums[n], tar, nums);
        int neg = sum(n + 1, s - nums[n], tar, nums);
        return pos + neg;

    }
}

public class targetsum {
    public static void main(String[] args) {
        Solution ob = new Solution();
        System.out.println(ob.findTargetSumWays(new int[] { 1, 1, 1, 1, 1 }, 3));
    }
}