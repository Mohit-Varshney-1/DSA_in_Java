class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
    String[] words = s.trim().split("\\s+");
     for(int i = words.length - 1; i >= 0; i--){
        ans.append(words[i]);
        if(i != 0){
        ans.append(" ");
        }
     }
     return ans.toString();
    }
}