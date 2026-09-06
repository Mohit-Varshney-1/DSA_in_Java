// class Solution {
//     public int missingNumber(int[] nums) {

//         Arrays.sort(nums);

//         int a = nums[nums.length - 1];  // max
//         int b = nums[0];                // min

//         for (int i = b; i <= a; i++) {

//             boolean found = false;

//             for (int j = 0; j < nums.length; j++) {

//                 if (nums[j] == i) {
//                     found = true;
//                     break;
//                 }
//             }

//             if (!found) {
//                 return i;
//             }
//         }

//         return a + 1;
//     }
// }
class Solution {
    public int missingNumber(int[] nums) {

        int xor = 0;

        for(int i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }

        return xor ^ nums.length;
    }
}

