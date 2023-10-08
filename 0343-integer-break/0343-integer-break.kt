class Solution {
    fun integerBreak(n: Int): Int {
        val dp = IntArray(n + 1)
        dp[1] = 1

        for (i in 2..n) {
            for (j in 1 until i) {
                dp[i] = Math.max(dp[i], Math.max(j * dp[i - j], j * (i - j)))
            }
        }

        return dp[n]
    }
}


