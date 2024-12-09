class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
       int n=nums.length,m=queries.length;
       int[] arr=new int[n];
       for(int i=1;i<n;i++){
            int a=nums[i-1]+nums[i];
            if(a%2==0){
                arr[i]=arr[i-1]+1;
            }
            else{
                arr[i]=arr[i-1];
            }
       } 
       boolean[] res=new boolean[m];
       int i=0;
       for(int[] query:queries){
            if(arr[query[1]]==arr[query[0]]){
                res[i]=true;
            }
            else{
                res[i]=false;
            }
            i++;
       }
       return res;
    }
}