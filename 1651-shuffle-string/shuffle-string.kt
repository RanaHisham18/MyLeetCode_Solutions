class Solution {
    fun restoreString(s: String, indices: IntArray): String {
        var newIndex = 0
        val array = CharArray(indices.size)
        for (index in indices){
            array[index] = s.elementAt(newIndex++)
        }
        return String(array)
    }
}