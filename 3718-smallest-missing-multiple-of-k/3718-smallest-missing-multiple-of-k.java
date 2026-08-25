class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> list=new HashSet<>();
        //if()
        int count=0;
        if(nums.length==1&& nums[nums.length-1]==k&& k!=1){

            return nums[nums.length-1]*2;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%k==0){
                list.add(nums[i]);
            }
        }
         
           int j=1;
         for(int i=0;i<nums.length;i++){
           int mul=j*k;
           if(!list.contains(mul)){
            return mul;
           } j++;count++;
         }
         if(count==nums.length){
            int r=nums[nums.length-1];
            return r+k;
         }
         return 0;
    }
}