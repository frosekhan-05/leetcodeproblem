class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,zero=0,res=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                zero++;
            }
           while (zero > k) {
                    if (nums[left] == 0) {
                         zero--;
                         }
                     left++;   // Move left pointer
                }
            res=Math.max(res,right-left+1);
        }
        return res;
    }
}