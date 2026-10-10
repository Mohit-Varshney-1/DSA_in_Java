class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String[] words = s.split(" ");
        for(int i = 0; i < words.length; i++){
            StringBuilder word = new StringBuilder(words[i]);
            ans.append(word.reverse());
            if(i < words.length -1){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}
