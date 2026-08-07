class Solution {
    public List<Integer> findMissingElements(int[] nums) {
      Arrays.sort(nums);
      int start=nums[0];
      int end=nums[nums.length-1];
      List<Integer> list=new ArrayList<>();
      Set<Integer> set=new HashSet<>();
      for(int num:nums){
        set.add(num);
      }
     // List<Integer> list2=new ArrayList<>();
      for(int i=start;i<end;i++){
        if(!set.contains(i)){
            list.add(i);
        }
      }  return list;
    }
}