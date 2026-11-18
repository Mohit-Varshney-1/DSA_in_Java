class Solution {
    public long dividePlayers(int[] skill) {
     Arrays.sort(skill);
     int left = 0;
     int right = skill.length - 1;
     long sum = 0;  
     int target = skill[left] + skill[right];
     while(left < right) {
        if(target != skill[left] + skill[right]){
            return -1;
        }
        sum += (long) skill[left] * skill[right];
        left++;
        right--;
     }
     return sum;
    }
}