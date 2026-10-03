class Solution {
    public String restoreString(String s, int[] indices) {
        char[] suff = new char[s.length()];
     for(int i = 0; i < indices.length; i++){
        suff[indices[i]] = s.charAt(i);
     }
     return new String(suff);
    }
}