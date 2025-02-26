class Solution:
    def maxAbsoluteSum(self, nums: List[int]) -> int:
        mi=0
        ma=0
        su=0
        ans=0
        for n in nums:
            su+=n
            ans=max(ans,su-mi)
            ans=max(ans,-su+ma)
            ma=max(su,ma)
            mi=min(su,mi)
        return ans