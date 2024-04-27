class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
         if (n <= 0) return false     
        var num = n.toDouble()
        while (num > 1) {
            num /= 2
        }
        return num == 1.0
    }
}