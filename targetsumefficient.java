
// before was 2 power n complexity
// we can do in n x m  complexity using dynamic programmign table . integral tabular knapsack algorithm we studied in semester 4
class Solution {
    public int findTargetSumWays(int[] nums, int target) {

        // edge case...odd numbers cant make it even

        int totalSum = 0;
        for (int n : nums)
            totalSum += n;

        // edge case: if odd or out of range, no solution
        if ((target + totalSum) % 2 != 0 || Math.abs(target) > totalSum)
            return 0;

        int s = (target + totalSum) / 2;
        ; // sum

        int[][] dp = new int[nums.length + 1][s + 1];

        for (int i = 0; i < nums.length; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= nums.length; i++) {
            for (int j = 0; j <= target; j++) {

                // exclude current element
                dp[i][j] = dp[i - 1][j];

                // include current element (if it fits)
                if (nums[i - 1] <= j)
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i - 1]];

            }
        }

        return dp[nums.length][target];

    }

}

public class targetsumefficient {
    public static void main(String[] args) {
        Solution ob = new Solution();
        System.out.println(ob.findTargetSumWays(new int[] { 1, 1, 1, 1, 1 }, 2));
    }
}