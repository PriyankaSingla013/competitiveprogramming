class Solution:
    def longestSquareStreak(self, nums: List[int]) -> int:
        nums.sort()
        dic=dict()
        n=len(nums)
        res=1
        for i in range (n):
            if nums[i]**0.5 in dic:
                dic[nums[i]]=dic[nums[i]**0.5]+1
                res=max(res,dic[nums[i]])
            else:
                dic[nums[i]]=1
        if res>=2:
            return res
        return -1