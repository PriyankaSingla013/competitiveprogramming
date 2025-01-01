class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int[] arr=new int[n];
        int zero=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                zero++;
            }
            arr[i]=zero;
        }
        int res=0;
        zero=0;
        for(int i=n-1;i>=0;i--){
            arr[i]+=zero;
            if(s.charAt(i)=='1'){
                zero++;
            }
            if(i!=n-1)
            res=Math.max(res,arr[i]);
        }
        return res;
    }
}