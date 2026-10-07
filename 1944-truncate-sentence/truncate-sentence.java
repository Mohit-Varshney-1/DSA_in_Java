class Solution {
    public String truncateSentence(String s, int k) {
        int count = 0;
        StringBuilder ans = new StringBuilder();
        String[] words = s.split("\\s+");
        for(String word : words){
            ans.append(word);
            count++;
            if(count == k){
                break;
            }
            ans.append(" ");
        }
        return ans.toString();
    }
}