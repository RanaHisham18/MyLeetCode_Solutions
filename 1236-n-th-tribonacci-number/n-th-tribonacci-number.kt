class Solution {
    fun tribonacci(n: Int): Int {
        if (n == 2 || n == 1 )
            return 1
             
        if (n == 0)
            return 0

            var x = 0
            var y = 1
            var z = 1

            for ( i in 3..n){
                val sum = z+x+y
                x=y
                y=z
                z=sum
            }
return z
    }
}