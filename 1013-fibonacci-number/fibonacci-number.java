class Solution {
    public int fib(int n) {
        if(n<2){
            return n;
        }
        int s1=0,s2=1;
        for(int i=2;i<=n;i++){
            int next=s1+s2;
            s1=s2;
            s2=next;
        }
        return s2;
    }
}