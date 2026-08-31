class Solution {
    public int partitionString(String s) {
      List<List<Character>> set=new ArrayList<>();
      List<Character> list=new ArrayList<>();
      for(int i=0;i<s.length();i++)
      {
        if(!list.contains(s.charAt(i))) list.add(s.charAt(i));
        else 
        {
            set.add(list);
            list=new ArrayList<>();
            list.add(s.charAt(i));
        }
      }  
      set.add(list);
      return set.size();
    }
}