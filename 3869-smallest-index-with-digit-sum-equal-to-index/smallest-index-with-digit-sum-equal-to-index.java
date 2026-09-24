class Solution {
    public int smallestIndex(int[] nums) {
       for(int i = 0; i < nums.length; i++){
        int num = nums[i];
        int DigSum = 0;
        while(num > 0){
          int Dig = num % 10;
          DigSum += Dig;
          num /= 10;

        }
          if(DigSum == i){
            return i;
          }  
    }
       return -1;
}
}