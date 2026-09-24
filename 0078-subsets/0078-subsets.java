class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        int index = 0;
        subSet(nums,new ArrayList(),index);
        return result;
    }

    public void subSet(int nums[],List<Integer> temp, int index){
        if(index == nums.length){
            result.add(new ArrayList(temp));
            return;
        }

        temp.add(nums[index]);
        subSet(nums,temp,index+1);
        temp.remove(temp.size()-1);
        subSet(nums,temp,index+1);
    }
}