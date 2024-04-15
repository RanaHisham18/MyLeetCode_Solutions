class Solution {
    fun buddyStrings(A: String, B: String): Boolean {
        if (A.length != B.length || A.isEmpty()) return false
        if (A != B)
        {
            var count = 0;
            var first = 'a'
            var second = 'a'
            for (i in A.indices)
            {
                if (A[i] == B[i]) continue;
                if (count >= 2) return false;
                if (count == 0)
                {
                    first = A[i];
                    second = B[i];
                    count++;
                    continue;
                }
                if (A[i] != second || B[i] != first) return false;
                count++;
            }
            return count == 2;
        }
        if (A.length > 26) return true;
        var fre = Array(26){0};
        for (i in A.indices)
        {
            if (fre[A[i]-'a'] == 1) return true;
            fre[A[i] - 'a']++;
        }
        return false;
    }
}