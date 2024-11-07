class Solution {
    public int largestCombination(int[] candidates) {
        int n=candidates.length;
        int[] arr=new int[24];
        for(int i=0;i<n;i++){
            int x=candidates[i];
            for(int j=0;j<24;j++){
                if((x>>j&1 )==1)
                    arr[j]++;
            }
        }
        int res=0;
        for(int i=0;i<24;i++){
            res=Math.max(arr[i],res);
        }
        return res;
    }
}