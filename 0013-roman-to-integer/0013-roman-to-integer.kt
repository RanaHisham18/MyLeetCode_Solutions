class Solution {
    
    fun romanToInt(s: String): Int {
    // Map to store romans numerals
    val romanMap: MutableMap<Char, Int> = HashMap()
    // Fill the map
    romanMap['I'] = 1
    romanMap['V'] = 5
    romanMap['X'] = 10
    romanMap['L'] = 50
    romanMap['C'] = 100
    romanMap['D'] = 500
    romanMap['M'] = 1000
    
    val n = s.length  
    var num = romanMap[s[n - 1]]!!
    for (i in n - 2 downTo 0) {
        
        if (romanMap[s[i]]!! >= romanMap[s[i + 1]]!!) {
            num += romanMap[s[i]]!!
        } else {
            num -= romanMap[s[i]]!!
        }
    }
    return num
}
}