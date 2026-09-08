class Solution {
    public int titleToNumber(String columnTitle) {
      int r = 0;
      for(int i = 0; i < columnTitle.length(); i++){
        int value = columnTitle.charAt(i) - 'A' + 1;
        // ye basic formula h is question ka
        r = r*26 + value;
      }  
      return r;
    }
}