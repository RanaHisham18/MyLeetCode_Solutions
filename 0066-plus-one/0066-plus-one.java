class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
    for(int i=n-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        
        digits[i] = 0;
    }
         int[] newList = new int [n+1];
   newList[0] = 1;
        
        //this two steps make the test case of 9 plus one works well.
    
    return newList;
        
    }
}

