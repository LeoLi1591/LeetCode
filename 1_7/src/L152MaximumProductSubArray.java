import java.util.Arrays;

public class L152MaximumProductSubArray {
    public int maxProduct(int[] nums) {
        // use dp to solve
        int res = Arrays.stream(nums).max().getAsInt();

        int curMin = 1, curMax = 1;

        for ( int n : nums){
            if (n == 0){
                curMax = 1;
                curMin = 1;
                continue;
            }

            int tmp = curMax * n;
            curMax = Math.max(n,Math.max(n * curMax,n* curMin));
            curMin = Math.min(n,Math.min(tmp,n* curMin));

            res = Math.max(res,curMax);
        }

        return res;
    }
}
