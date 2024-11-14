class Solution:
    def countInterestingSubarrays(self, nums: List[int], modulo: int, k: int) -> int:
        n=len(nums)
        l=[]
        prev=-1
        for i in range (n):
            x=nums[i]%modulo
            if x==k:
                l.append(i-prev)
                prev=i
        l.append(n-prev)
        n=len(l)
        res=0  
        if(k==0):  
            for i in range (n):
                res+=(l[i]-1)*l[i]//2
        x=l.copy()      
        for i in range(n-modulo-1,-1,-1):
            x[i]+=x[i+modulo]
        for i in range(n):
            start=i+k
            if(k==0):
                start=i+modulo
            if start<n:
                res+=l[i]*x[start]
                print(res,l[i],l[start])
            
        return res
            