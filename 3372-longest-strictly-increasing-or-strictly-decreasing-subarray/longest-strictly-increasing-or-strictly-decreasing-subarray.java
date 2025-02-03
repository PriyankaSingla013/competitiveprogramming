class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int length=1,n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j-1]>=nums[j]){
                    break;
                }
                length=Math.max(length,j-i+1);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j-1]<=nums[j]){
                    break;
                }
                length=Math.max(length,j-i+1);
            }
        }
        return length;
    }
}