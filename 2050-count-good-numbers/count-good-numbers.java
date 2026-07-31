class Solution {
    public long pow(long x,long n){
        long mod=1000000007l;
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return pow((x*x)%mod,n/2)%mod;
        }
        return (x*pow(x,n-1))%mod;
        }
    public int countGoodNumbers(long n) {
        long mod=1000000007l;
       long even=(n+1)/2;
       long odd=n/2;
       return (int)((pow(5,even)*pow(4,odd))% mod);
    }
}