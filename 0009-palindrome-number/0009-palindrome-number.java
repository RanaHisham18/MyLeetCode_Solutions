class Solution {
    public boolean isPalindrome(int x) {
        boolean res;
        int r;
        int temp = x;
        int  sum  = 0;
        while (x > 0) {
            r = x % 10;
            sum = (sum* 10) + r;
            x = x /10;   
    }
        
        if (temp == sum){
          res = true; }   
		else {
           res = false ;   
 }  
        return res;
        }   
			
    
}