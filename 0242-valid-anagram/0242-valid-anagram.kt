class Solution {
    fun isAnagram(s: String, t: String): Boolean {
     //compare length of two arrays, if not equal no need to do checks
        if(s.length!= t.length){
            return false
        }
        val map  =  HashMap<Char,Int>()
        val s_array = s.toCharArray()
        val t_array = t.toCharArray()
        //add counts of one array in hashmap
        for ( c in s_array) map[c] = map.getOrDefault(c, 0) + 1
        
        //loop through the second array
        for (c in t_array){
            var currentvalue = map.getOrDefault(c,0)
            if (currentvalue <1)
            {return false}
            map[c] = --currentvalue
        }
        return true 
    }
}