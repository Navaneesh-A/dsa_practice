import java.util.*;

public class burstballoon {

    public static void main(String[] args) {
        System.out.println(solve(new int[] { 1, 2, 3 }));
    }

    public static int solve(int[] nums) {
        int[] dp = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                dp[i] = nums[i] * nums[i + 1];
            } else if (i == nums.length - 1) {
                dp[i] = nums[i] * nums[i - 1];
            } else {
                dp[i] = nums[i] * nums[i - 1] * nums[i + 1];
            }
        }

        System.out.println(Arrays.toString(dp));
        int max= Math.max(dp);
        
        return sum;
    }
}
