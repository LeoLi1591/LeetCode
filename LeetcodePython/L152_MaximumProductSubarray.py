def maxProduct(self, nums: List[int]) -> int:

    # O(n) 
    # init res
    res = max(nums)

    # any numebr times 1 equal 1
    curMin,curMax = 1,1

    for n in nums:
        if n == 0:
            curMax,curMin = 1,1
            continue

        # maintain 2 values instead of dp
        tmp = n * curMax
        curMax = max(n * curMax, n * curMin,n)
        curMin = min(tmp, n * curMin,n)
        res = max(res,curMax)

    return res