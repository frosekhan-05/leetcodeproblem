class Solution {
    TreeSet<Integer> list=new TreeSet<>();
    public int totalNumbers(int[] digits) {
        ArrayList<Integer> temp=new ArrayList<>();
        boolean[] b=new boolean[digits.length];
        rec(digits,temp,b);
        return list.size();
    }
    public void rec(int arr[],ArrayList<Integer> temp,boolean[] used){
        if(temp.size()==3){
            int num=0;
            if(temp.get(0)==0) return;
             for(int i:temp){
                num=num*10+i;
             }
             if(num%2!=0){
                return;
             }
             list.add(num);
                   }
            HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<arr.length;i++){
                if(used[i]){
                    continue;
                }
                
                if(set.contains(arr[i])){ continue;}
                set.add(arr[i]);
                used[i]=true;
                temp.add(arr[i]);
                rec(arr,temp,used);
                temp.remove(temp.size()-1);
                used[i]=false;
            }
    }
}