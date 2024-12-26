class Solution {
    int res;
    void dfs(int sum,int idx,int[] nums,int target){
        if(idx==nums.length){
            if(sum==target){
                res++;
            }
            return;
        }
            dfs(sum+nums[idx],idx+1,nums,target);
            dfs(sum-nums[idx],idx+1,nums,target);
    }
    public int findTargetSumWays(int[] nums, int target) {
        this.res=0;
        dfs(0,0,nums,target);
        return res;
    }
}