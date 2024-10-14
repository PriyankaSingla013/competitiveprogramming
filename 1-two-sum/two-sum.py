class Solution(object):
    def twoSum(self, nums, target):
        n=len(nums)
        dic=dict()
        for i in range (n):
            if(target-nums[i] in dic):
                return [i,dic[target-nums[i]]]
            dic[nums[i]]=i
            
        