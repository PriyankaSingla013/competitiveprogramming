class Solution:
    def findKthBit(self, n: int, k: int) -> str:
        s="0"
        while(k>len(s)):
            s=s+'1'
            for j in range (len(s)-2,-1,-1):
                if(s[j]=='1'):
                    s=s+'0'
                else:
                    s=s+'1'
        return s[k-1]