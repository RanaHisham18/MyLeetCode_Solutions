class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
 val Hashcount = mutableMapOf<Char, Int>()
 
 for (i in magazine.toCharArray()){
     Hashcount[i] = Hashcount.getOrDefault(i, 0) + 1
 }
 
    for (j in ransomNote.toCharArray()){
        //check for magazine (hashcount) in randosnote
        	if (!Hashcount.containsKey(j) || Hashcount[j]!! <= 0) {
return false
}
            	Hashcount[j] = Hashcount.getOrDefault(j, 0) - 1
}
return true
            
    
        
    }
 }