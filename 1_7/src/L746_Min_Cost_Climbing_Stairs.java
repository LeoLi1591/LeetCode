public class L746_Min_Cost_Climbing_Stairs {
    public int minCostClimbingStairs(int[] cost) {
        // dp
        // tabulation
        int[] dp = new int[cost.length+1];

        for (int i =2; i < dp.length;i++){
            int one_step = dp[i-1] + cost[i-1];
            int two_steps = dp[i-2] + cost[i-2];
            dp[i] = Math.min(one_step,two_steps);
        }

        return dp[dp.length-1];
    }
}
