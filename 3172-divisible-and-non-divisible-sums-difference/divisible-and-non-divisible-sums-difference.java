class Solution {
    public int differenceOfSums(int n, int m) {
        int div = 0;
        int nonDiv = 0;
      for(int i = 0; i < n; i++){
        if((i + 1) % m == 0){
          div += (i + 1);
        }else{
            nonDiv += (i + 1);
        }
      } 
      return nonDiv - div;
    }
}