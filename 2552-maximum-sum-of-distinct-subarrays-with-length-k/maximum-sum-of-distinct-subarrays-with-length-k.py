class Solution:
    def maximumSubarraySum(self, nums: List[int], k: int) -> int:
        dic={}
        n=len(nums)
        dup=0
        sum=0
        res=0
        for i in range (k):
            if(nums[i] in dic):
                dic[nums[i]]+=1
                if(dic[nums[i]]==2):
                    dup+=1
            else:
                dic[nums[i]]=1
            sum+=nums[i]
        if(dup==0):
            res=sum
        for i in range (k,n):
            if(nums[i] in dic):
                dic[nums[i]]+=1
                if(dic[nums[i]]==2):
                    dup+=1
            else:
                dic[nums[i]]=1
            sum+=nums[i]-nums[i-k]
            dic[nums[i-k]]-=1
            if(dic[nums[i-k]]==1):
                dup-=1
            if(dup==0):
                res=max(res,sum)
        return res
        