class Solution {
    public int[] sortedSquares(int[] nums) {
        // int[] ans = new int[nums.length];
        // for(int i = 0; i < nums.length; i++){
        //      ans[i] = nums[i]*nums[i];
        // }
        // Arrays.sort(ans);
        // return ans;
        int n = nums.length;
        int [] ans = new int[n];
        int left = 0;
        int right = n - 1;
        int index = n - 1;
        while(left <= right){
            int leftSq = nums[left]*nums[left];
            int rightSq = nums[right]*nums[right];
            if(leftSq > rightSq){
                ans[index] = leftSq;
                left++;
            }else{
                ans[index] = rightSq;
                right--;
            }
            index--;
        }
        return ans;
    }
}