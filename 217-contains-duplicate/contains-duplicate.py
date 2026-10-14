class Solution(object):
    def containsDuplicate(self, nums):
        self = set()
        for num in nums:
            if num in self:
                return True
            self.add(num)
        return False
        