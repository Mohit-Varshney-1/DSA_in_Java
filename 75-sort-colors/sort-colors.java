class Solution {
    public void sortColors(int[] nums) {
    for(int turn = 0; turn < nums.length - 1; turn++){
        for(int j = 0; j < nums.length - 1 -turn; j++){
            if(nums[j] > nums[j+1]){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
            }
        }
    } 
    }
}