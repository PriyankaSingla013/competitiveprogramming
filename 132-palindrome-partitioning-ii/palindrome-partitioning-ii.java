class Solution {
    public int minCut(String s) {
        int n=s.length();
        int[] arr=new int[n];
        Arrays.fill(arr,Integer.MAX_VALUE);
        return helper(0,n,arr,s);
    }
    int helper(int idx,int n,int[] arr,String s){
        if(idx==n){
            return -1;
        }
        if(arr[idx]!=Integer.MAX_VALUE){
            return arr[idx];
        }
        if(check(s)){
            arr[idx]=0;
            return 0;
        }
        for (int i=idx+1;i<=n;i++){
            String st=s.substring(idx,i);
            if(check(st)){
                arr[idx]=Math.min(arr[idx],1+helper(i,n,arr,s));
            }
        }
        return arr[idx];
    }
    boolean check(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}