public class L70_Climbing_Stairs {
    // O(2^n) runtime not good
    // Fibonacci
//    public int climbStairs(int n) {
//        return fibo(0,n);
//    }
//
//    private int fibo(int i, int n){
//        if (i > n){
//            return 0;
//        }
//
//        if (i == n){
//            return 1;
//        }
//
//        return fibo(i+1,n) + fibo(i+2,n);
//    }


    // good one dp
    // O(m)
    public int climbStairs(int n){
        if (n == 1){
            return 1;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}
