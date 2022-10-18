class Solution {
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
       if ( r * c != mat.size*mat[0].size){
         return mat
       } 
        val result = Array(r){IntArray(c)}
        var i = 0
        var j = 0
        for(matrix in mat) {
            for(m in matrix) {
                if(j == c) {
                    j = 0
                    i++
                }
                result[i][j++] = m
            }
        }

        return result
    }
    }
