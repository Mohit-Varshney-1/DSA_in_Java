class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxmoney = 0;
        for(int i = 0; i < accounts.length; i++){
        int money = 0;
            for(int j = 0; j < accounts[0].length; j++ ){
                money += accounts[i][j];
                maxmoney = Math.max(maxmoney , money);
            }
        }
        return maxmoney;
    }
}