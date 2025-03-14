public class L198_House_Robber {
    public int rob(int[] nums) {
        // dp
        int N = nums.length;

        if (N == 0){
            return 0;
        }

        int[] dp = new int[nums.length+1];

        dp[N] = 0;
        dp[N-1] = nums[N-1];

        for (int i = N-2; i >= 0; i--){
            System.out.println(dp[i+1]);
            System.out.println(dp[i+2] + nums[i]);

            dp[i] = Math.max(dp[i+1], dp[i+2] + nums[i]);
        }

        return dp[0];
    }

    public int rob2(int[] nums){
        // dp tabulation
        int n = nums.length;

        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i < n; i++){
            dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
        }

        return dp[n-1];
    }
}
