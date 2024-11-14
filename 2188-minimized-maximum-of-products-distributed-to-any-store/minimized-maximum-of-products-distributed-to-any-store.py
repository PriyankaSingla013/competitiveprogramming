class Solution:
    def minimizedMaximum(self, n: int, quantities: List[int]) -> int:
        quantities.sort()
        m=len(quantities)
        def possible(mid):
            ans=0
            for q in quantities:
                ans+=(q+mid-1)//mid
            if(ans<=n):
                return True
            return False
        i=1
        j=quantities[m-1]
        ans=quantities[m-1]
        while(i<=j):
            mid=(i+j)//2
            if(possible(mid)):
                j=mid-1
                ans=mid
            else:
                i=mid+1
        return ans

