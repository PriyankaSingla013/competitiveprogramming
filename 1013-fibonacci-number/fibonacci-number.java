class Solution {
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        int f0=0,f1=1;
        while(n>1){
            int f2=f0+f1;
            f0=f1;
            f1=f2;
            n--;
        }
        return f1;
    }
}