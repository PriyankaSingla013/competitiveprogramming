class Solution(object):
    def countArrangement(self, n):
        def func(idx,byte,n):
            if idx==n:
                return 1
            res=0
            for i in range(1,n+1):
                if(i%(idx+1)==0 or (idx+1)%i==0):
                    if(byte>>i & 1 ==0):
                        res+=func(idx+1,byte | 1<<i,n)
            return res
        return func(0,0,n)
        