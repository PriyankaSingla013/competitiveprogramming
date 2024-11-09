class Solution {
    public long minEnd(int n1, int x1) {
        long res=0;
        long n=n1;
        long x=x1;
        n--;
        for(int i=0,j=0;i<63;i++){
            if((x>>i & 1)==1){
                res ^= (1L<<i);
            }
            else{
                res ^= ((n>>j) & 1)<<i;
                j++;
            }

        }
        return res;
    }
}