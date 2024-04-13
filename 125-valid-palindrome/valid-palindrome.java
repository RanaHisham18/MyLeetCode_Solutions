class Solution {
    public boolean isPalindrome(String s) {
        boolean result = true;
        String newString = "";
        String trimmedString = s.replaceAll("[^A-Za-z0-9]", "")
        .toLowerCase();
        int stringLength = trimmedString.length();
       for (int i = stringLength -1  ; i >= 0 ; i--) {
         newString = newString + trimmedString.charAt(i);
        if (newString.equals(trimmedString)){
          result = true;
        }
        else{
            result = false;
        }

       }
       return result;
    }
}