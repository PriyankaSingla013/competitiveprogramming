class Solution:
    def findXSum(self, nums: List[int], k: int, x: int) -> List[int]:
        from collections import Counter
        import heapq
        
        def x_sum(subarray):
            freq = Counter(subarray)
            # Get the top x most frequent elements
            most_common = heapq.nlargest(x, freq.items(), key=lambda item: (item[1], item[0]))
            # Sum of the elements, keeping only top x frequent ones
            result = sum(value * count for value, count in most_common)
            return result

        result = []
        for i in range(len(nums) - k + 1):
            subarray = nums[i:i + k]
            result.append(x_sum(subarray))

        return result   