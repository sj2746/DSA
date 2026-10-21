class Solution:
    def minOperations(self, s: str) -> int:
        n=len(s)
        if s==''.join(sorted(s)):
            return 0
        if n==2:
            return -1
        mini=min(s)
        maxi=max(s)

        if s[0]==mini or s[-1]==maxi:
            return 1
        if s[0]!=maxi or s[-1]!=mini:
            return 2
        for i in range(1,n-1):
            if s[i]==maxi or s[i]==mini:
                return 2
            
        return 3