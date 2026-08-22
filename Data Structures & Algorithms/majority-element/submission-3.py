class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        n=len(nums)
        d={}
        for i in nums:
            if i not in d:
                d[i]=nums.count(i)
        for i in d :
            if d.get(i)>int(n/2):
                return i
            

        