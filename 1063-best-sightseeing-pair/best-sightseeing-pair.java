class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n=values.length;
        int max=values[0];
        int res=0;   
        for(int i=1;i<n;i++){
            int curr=values[i];
            max--;
            res=Math.max(res,max+curr);
            max=Math.max(curr,max);
        } 
        return res;
    }
}