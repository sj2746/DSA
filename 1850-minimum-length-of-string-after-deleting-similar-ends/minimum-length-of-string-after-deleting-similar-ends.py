class Solution:
    def minimumLength(self, s: str) -> int:
        n=len(s)
        i=0
        j=n-1
        while(i<j and s[i]==s[j]):
            ch=s[i]
            while i<=j and s[i]==ch:
                i+=1
            while i<=j and s[j]==ch:
                j-=1
        return max(0,j-i+1)
            
        