class Solution {
    fun addBinary(a: String, b: String): String {
        var i = a.length - 1
        var j = b.length - 1
        var result = ""
        var carry = 0
        
        while ( i >= 0 || j>= 0){
            var sum = 0
            if (i >= 0) sum += a[i]-'0'
            i--
            if (j >= 0) sum += b[j]-'0'
            j--
            result += ((sum+carry)%2).toString()
            carry = (sum+carry)/2
        }
        if (carry > 0) result += "1"
        return result.reversed() 
    }
}