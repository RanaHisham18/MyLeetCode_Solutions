class Solution {
    fun isValid(s: String): Boolean {
        var stack = Stack<Char>()
            stack.push('#')
            for (i in s) {
            if (i == '(') stack.push(i)
            if (i == '[') stack.push(i)
            if (i == '{') stack.push(i)
            if (i == ')') {
                val c = stack.pop()
                if (c != '(') return false
            }
            if (i == ']') {
                val c = stack.pop()
                if (c != '[') return false
            }
            if (i == '}') {
                val c = stack.pop()
                if (c != '{') return false
            }
        }
        if (stack.size > 1) return false
        return true
    }
}