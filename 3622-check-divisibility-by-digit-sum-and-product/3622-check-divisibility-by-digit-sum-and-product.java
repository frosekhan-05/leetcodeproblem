class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int pro=1;
        int x=n;int digit=0;
       while(n!=0){
         int r=n%10;
         sum+=r;
         pro*=r;
         n/=10;
       } 
       digit=sum+pro;
       
       return x%digit==0;
    }
}