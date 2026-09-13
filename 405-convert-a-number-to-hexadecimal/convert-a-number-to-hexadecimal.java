class Solution {
    public String toHex(int num) {

        if (num == 0) {
            return "0";
        }

        char[] hex = "0123456789abcdef".toCharArray();

        StringBuilder ans = new StringBuilder();

        while (num != 0) {

            int remainder = num & 15;   // num % 16
            ans.append(hex[remainder]);

            num = num >>> 4;             // num / 16
        }

        return ans.reverse().toString();
    }
}