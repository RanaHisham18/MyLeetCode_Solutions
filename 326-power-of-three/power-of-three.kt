class Solution {
    fun isPowerOfThree(n: Int): Boolean {
        var num = n.toDouble()
        while ( num >1){
            num /= 3
        }
        return num == 1.0
        
    }
}