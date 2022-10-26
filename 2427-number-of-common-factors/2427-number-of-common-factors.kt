class Solution {
    fun commonFactors(a: Int, b: Int): Int {
        var counter = 0
        var max = a
        if (a < b){
        max = b  
        }  
        
         for (i in max downTo 1){
         if(a % i == 0 && b % i == 0)  {
             counter += 1
         } 
        }
     return counter   
    }
}