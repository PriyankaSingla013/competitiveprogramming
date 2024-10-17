class Solution:
    def maximumSwap(self, num: int) -> int:
        strnum=str(num)
        n=len(strnum)
        for i in range (n):
            idx=i
            max=strnum[i]
            
            for j in range (i+1,n):
                if(strnum[j]>=max):
                    
                    max=strnum[j]
                    idx=j
                    
            if(max!=strnum[i]):
               
                nu=0
                for k in range(n):
                    x=strnum[k]
                    
                    if(k==i):
                        x=strnum[idx]
                    if(k==idx):
                        x=strnum[i]
                    
                    nu=nu*10+int(x)
                return nu
        return num