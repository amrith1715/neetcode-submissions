class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        n=len(nums)
        d={}
        for i in nums:
            if i in d:
                return True
            d[i]=1
        return False
         