class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[nums.length - 1];
        while(b != 0){
            int oldValueOfb = b;
            b = a%b;
            a = oldValueOfb;
    }
            return a;

}
}