class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length];
        int count=0;
        int ans=0;
        boolean a=false;
        for(int i=0;i<nums1.length;i++){
            count=0;
            a=false;
            for(int j=0;j<nums2.length;j++){
               if(nums1[i]==nums2[j]){
                for(int k=j+1;k<nums2.length;k++){
                        if(nums1[i]<nums2[k]){
                            ans=nums2[k];
                            a=true;
                            break;
                        }
                }
               }
            }
            if(a){
                arr[i]=ans;
            }
            else
            {
                arr[i]=-1;
            }
        }
        return arr;
    }
}