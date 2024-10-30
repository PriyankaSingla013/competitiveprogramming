class Solution(object):
    def minimumMountainRemovals(self, nums):
        n=len(nums)
        left=[1]*n
        right=[1]*n
        for i in range (n):
            for j in range (i):
                if nums[i]>nums[j]:
                    left[i]=max(left[j]+1,left[i])
        for i in range (n-1,-1,-1):
            for j in range (n-1,i,-1):
                if nums[i]>nums[j]:
                    right[i]=max(right[j]+1,right[i])
        res=0
        for i in range (1,n-1):
            if left[i]>1 and right[i]>1:
                res=max(res,left[i]+right[i])
        return n-res+1
        