class Solution {
    fun numberOfSteps(num: Int): Int {
        var mutableNum = num   // Use a mutable variable
        var counter = 0
        while (mutableNum > 0) {
            if (mutableNum % 2 == 0) {
                mutableNum /= 2
            } else {
                mutableNum--
            }
            counter++
        }

        return counter
    }
}
