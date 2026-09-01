class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer,Integer> freq=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
      }  
      ArrayList<Integer> list=new ArrayList<>(freq.keySet());
       Collections.sort(list,(a,b)->freq.get(b)-freq.get(a));
      int arr[]=new int[k];
      for(int i=0;i<k;i++){
        arr[i]=list.get(i);
      }
     
      return arr;
    }
}