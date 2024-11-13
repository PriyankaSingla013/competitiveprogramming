class Solution:
    def makeStringsEqual(self, s: str, target: str) -> bool:
        n=len(s)
        ones=0
        zto=0
        otz=0
        for i in range (n):
            if(s[i]=='1'):
                ones+=1
            if(s[i]!=target[i]):
                if(s[i]=='1'):
                    otz+=1
                else:
                    zto+=1
        if(zto>0):
            if ones==0:
                return False
        ones+=zto
        if(otz>0):
            if ones<=otz:
                return False
        return True
        