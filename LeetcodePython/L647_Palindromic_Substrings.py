class Solution:
    # dp
    # def __init__(self):
    #     self.count1 = 0
    #
    # def countSubstrings(self, s: str) -> int:
    #     count = 0
    #     for i in range(len(s)):
    #         for j in range(i, len(s)):
    #             if self.is_palindrome(s, i, j):
    #                 count += 1
    #                 if self.count1 == 2:
    #                     self.count1 = 0
    #                     break
    #     return count
    #
    # def is_palindrome(self, s, i, j):
    #     while i <= j:
    #         if s[i] != s[j]:
    #             self.count1 += 1
    #             return False
    #         i += 1
    #         j -= 1
    #     return True

    # dp faster
    def countSubstrings(self, s: str) -> int:
        n = len(s)
        dp = [[False] * n for i in range(n)]
        count = 0
        for i in range(n - 1, -1, -1):
            for j in range(i, n):
                if i == j:
                    dp[i][j] = True
                elif j == i + 1:
                    dp[i][j] = (s[i] == s[j])
                else:
                    dp[i][j] = (s[i] == s[j]) and dp[i + 1][j - 1]
                if dp[i][j]:
                    count += 1
        return count

    # dp faster 40倍
    def countSubstrings(self, s: str) -> int:
        ans = 0
        ss = "#" + "#".join(s) + "#"
        n = len(ss)
        l, r = 0, 0
        dp = [0] * n

        for i in range(n):
            if i < r:
                dp[i] = min(r - i, dp[l + (r - i)])
                j = i + dp[i] + 1
                k = i - dp[i] - 1
                while j < n and k > -1 and ss[j] == ss[k]:
                    dp[i] += 1
                    j += 1
                    k -= 1

                if j - 1 > r:
                    l, r = max(k + 1, 0), j - 1
                ans += dp[i] // 2

            return ans + len(s)
