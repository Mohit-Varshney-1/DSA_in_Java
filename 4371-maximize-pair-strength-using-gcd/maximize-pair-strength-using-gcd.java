class Solution {

    public long maxPairStrength(int[] nums) {

        long Maxans = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                long g = gcd(nums[i], nums[j]);

                long ans = (long) nums[i] * nums[j] / (g * g);

                Maxans = Math.max(Maxans, ans);
            }
        }

        return Maxans;
    }

    public int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}