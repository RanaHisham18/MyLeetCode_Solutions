class Solution {
    fun countPrimes(n: Int): Int {
        var isprime = BooleanArray(n+1) { 
            true 
        }
        
         var p = mutableListOf<Int>()
        for ( i in 2 until n){
            if (isprime[i]){
                p.add(i)
            }
             for (j in 0 until p.size) {
                if (i*p[j] >= n) break
                isprime[i*p[j]] = false
                if (i%p[j] == 0) break
            }
            
        }
                return p.size.toInt()

    }
}