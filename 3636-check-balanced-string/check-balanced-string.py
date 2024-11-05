class Solution:
    def isBalanced(self, num: str) -> bool:
        sum=0
        for i in range (len(num)):
            if(i%2==0):
                sum+=int(num[i])
            else:
                sum-=int(num[i])
        return sum==0