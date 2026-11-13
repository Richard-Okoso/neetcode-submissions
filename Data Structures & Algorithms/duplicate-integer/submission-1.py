class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        newList = set()

        for n in nums:

            if n in newList:
                return True
            
            newList.add(n)
        return False
        