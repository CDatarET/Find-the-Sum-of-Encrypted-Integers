class Solution:
    def encrypt(self, n):
        m = 0
        l = 0
        while n > 0:
            m = max(m, n % 10)
            n = n // 10
            l += 1
        
        return m * (pow(10, l) - 1) // 9

    def sumOfEncryptedInt(self, nums):
        s = 0
        for n in nums:
            s += self.encrypt(n)

        return s
