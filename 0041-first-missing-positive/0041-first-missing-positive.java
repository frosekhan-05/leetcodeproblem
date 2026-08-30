class Solution {
    public int firstMissingPositive(int[] nums) {
       int num= 0;
       int count=0;
       Arrays.sort(nums);
       int j=1;
       for(int i=0;i<nums.length;i++){
           if(nums[i]==j){
             j++;
           }
       } 
      
       return j;
    }
}