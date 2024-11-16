class Solution:
    def resultsArray(self, nums: List[int], k: int) -> List[int]:
        if(k==1):
            return nums
        min_idx=0
        i=1
        n=len(nums)
        res=[]
        while(i<n):
            if(nums[i-1]+1!=nums[i]):
                min_idx=i
            if(i>=k-1):
                if(min_idx<=i-k+1):
                    res.append(nums[i])
                else:
                    res.append(-1)
            i+=1
        return res