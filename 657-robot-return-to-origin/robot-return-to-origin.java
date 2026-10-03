class Solution {
    public boolean judgeCircle(String moves) {
      int x = 0;
      int y = 0;
      for(int i = 0; i < moves.length(); i++){
        char dir = moves.charAt(i);
        if(dir == 'D'){
            y--;
        }
        else if(dir == 'U'){
            y++;
        }
        else if(dir == 'L'){
            x--;
        }
        else if(dir == 'R'){
            x++;
        }
      } 
      return x == 0 && y == 0; 
    }
}