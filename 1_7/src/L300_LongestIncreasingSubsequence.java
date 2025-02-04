import java.util.Arrays;

public class L300_LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums){
        // apply DP
        // Runtime O (n^2) not good
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);

        for (int i = 0; i < nums.length;i++){
            for (int j = 0; j < i;j++){
                if (nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }

        int max = 0;
        for (int i : dp){
            max = Math.max(max,i);
        }

        return max;
    }
}
