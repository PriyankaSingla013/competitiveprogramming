int maxAscendingSum(int* nums, int numsSize){
    int res=nums[0];
    int sum=nums[0];
    for(int i=0;i<numsSize-1;i++){
        if(nums[i+1]>nums[i]){
            sum+=nums[i+1];
        }
        else{
            sum=nums[i+1];
        }
        if(sum>res){
            res=sum;
        }
    }
    return res;
}