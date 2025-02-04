public class L72_EditDistance {
    public int minDistance(String word1, String word2) {
        // use dp
        int source = word1.length();
        int target = word2.length();

        // create 2d array for dp
        int[][] dp = new int[source+1][target+1];

        // fill out first row and column
        for (int i = 1; i <= source;i++){
            dp[i][0] = i;
        }

        for (int i = 1; i <= target;i++){
            dp[0][i] = i;
        }

        // use iteration fill the dp
        for (int i = 1; i <= source;i++){
            for (int j = 1; j <= target;j++){
                if (word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    // dp[i][j] = dp[i-1][j-1] + 1;
                    // dp[i][j] = Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                    dp[i][j] = Math.min(
                            dp[i-1][j-1],
                            Math.min(dp[i-1][j],dp[i][j-1])) + 1;
                }
            }
        }

        return dp[source][target];

    }
}
