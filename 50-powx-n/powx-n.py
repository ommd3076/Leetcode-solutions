class Solution(object):
    def myPow(self, x, n):
        res = 1
        negative = n < 0
        n = abs(n)
        while n > 0:
            if n % 2 == 1:
                res = res * x
            
            x = x * x
            n = n // 2
        if negative:
            return 1.0 / res
        return res
        
        