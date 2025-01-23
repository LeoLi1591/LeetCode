class Solution:
    def numDecodings(self, s: str) -> int:

        # dynamic program
        dp = {len(s) : 1}

        def dfs(i):
            # best case
            if i in dp:
                return dp[i]
            # 0 case
            if s[i] == "0":
                return 0

            res = dfs(i+1)
            if i+1 < len(s) and (s[i] == "1" or s[i] == "2" and s[i+1] in "0123456"):
                res += dfs(i+2)

            # update dp
            dp[i] =res

            return res

        return dfs(0)

    print(numDecodings("1","123"))

# def main():
#     s = Solution
#     str = "5555555"
#     hello = "0"
#     print(s.numDecodings(hello,str))
#
# if __name__ == "__main__":
#     main()