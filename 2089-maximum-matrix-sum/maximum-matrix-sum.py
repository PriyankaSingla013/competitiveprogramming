class Solution:
    def maxMatrixSum(self, matrix: List[List[int]]) -> int:
        ng=0
        m=100000
        sum=0
        for l in matrix:
            for e in l:
                if e<0:
                    ng+=1
                    sum-=e
                    m=min(m,-e)
                else:
                    sum+=e
                    m=min(m,e)
        if(ng%2==0):
            return sum
        return sum-2*m