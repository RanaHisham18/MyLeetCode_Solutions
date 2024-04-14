class Solution {
  bool isIsomorphic(String s, String t) {
    for (var i = 0 ; i< s.length ; i++){
        if(s.indexOf(s[i]) != t.indexOf(t[i])){
            return false;
        }
    }
    return true;
  }
}