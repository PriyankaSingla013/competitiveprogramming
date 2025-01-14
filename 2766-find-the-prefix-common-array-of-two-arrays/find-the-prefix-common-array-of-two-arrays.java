class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length,num=0;
        int[] count=new int[n];
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            count[A[i]-1]++;
            count[B[i]-1]++;
            if(count[A[i]-1]==2){
                num++;
            }
            if(A[i]!=B[i] && count[B[i]-1]==2){
                num++;
            }
            
            res[i]=num;
        }
        return res;
    }
}