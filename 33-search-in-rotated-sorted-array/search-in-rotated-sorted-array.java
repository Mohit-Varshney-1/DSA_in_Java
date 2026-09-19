// class Solution {
//     public int search(int[] nums, int target) {
//         for(int i = 0; i < nums.length; i++){
//             if(target == nums[i]){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     }
class Solution {
    public int search(int[] nums, int target) {

        int si = 0;
        int ei = nums.length - 1;

        while (si <= ei) {

            int mid = si + (ei - si) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half sorted
            if (nums[si] <= nums[mid]) {

                if (nums[si] <= target && target < nums[mid]) {
                    ei = mid - 1;
                } else {
                    si = mid + 1;
                }

            // Right half sorted
            } else {

                if (nums[mid] < target && target <= nums[ei]) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }
            }
        }

        return -1;
    }
}
