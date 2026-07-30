class Solution {
    public int minimumPushes(String word) {
       int result=0;
       HashMap<Integer,Integer> map=new HashMap<>();
       int assign=2;
       for(char ch:word.toCharArray()){
        if(assign>9){
         assign=2;
        }
        int push=map.getOrDefault(assign,0)+1;
        map.put(assign,push);
        result+=push;
        assign++;
       } return result;
    }
}