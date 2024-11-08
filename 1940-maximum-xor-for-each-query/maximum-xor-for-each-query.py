class Solution:
    def getMaximumXor(self, nums: List[int], maximumBit: int) -> List[int]:
        n=len(nums)
        x=2**maximumBit -1
        res=[]
        xor=0
        for num in nums:
            xor^=num
            res.append(x-xor)
        res.reverse()
        return res
        