def coinChange(self, coins: List[int], amount: int) -> int:
    # init dynamic program with max coin number
    # O(amount * coins number)
    dp = [amount + 1] * (amount + 1)
    # init first value
    dp[0] = 0

    for a in range(1, amount +1):
        for c in coins:
            if a - c >= 0:
                dp[a] = min(dp[a], 1 + dp[a-c])
    return dp[amount] if dp[amount] != amount + 1 else -1
