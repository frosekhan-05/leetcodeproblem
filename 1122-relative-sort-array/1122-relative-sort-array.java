class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    list.add(arr1[j]);
                }
            }      
        }
        for(int i=0;i<arr1.length;i++){
             if(!list.contains(arr1[i])){
                list2.add(arr1[i]);
             }
        }
        Collections.sort(list2);
        for(int i:list2){
            list.add(i);
        }
        int arr3[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
           arr3[i]=list.get(i);
        }
        return arr3;
    }
}