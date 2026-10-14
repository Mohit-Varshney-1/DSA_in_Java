class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
       int n = points.length;
       int[] x = new int[n];
       for(int i = 0; i < n; i++){
        x[i] = points[i][0];
       } 
       Arrays.sort(x);
       int maxWidth = 0;
       for(int i = 1; i < n; i++){
        int diff = x[i] - x [i - 1];
        if(diff > maxWidth){
            maxWidth = diff;
        }
       }
       return maxWidth;
    }
}