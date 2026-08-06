class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n; ;i++){
            int product=1;
            int num=i;
            while(num!=0){
                int r=num%10;
                product*=r;
                num/=10;
            }
            if(product%t==0){
                return i;
            }
        }
        
    }
}