class Solution {
    public int[] concatWithReverse(int[] nums) {
        int arr[]=new int[nums.length+nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            count++;
        }
        int j=nums.length-1;
        for(int i=count;i<arr.length;i++){
             arr[i]=nums[j--];
        }
        return arr;
    }
}