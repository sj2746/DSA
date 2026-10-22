class Solution:
    def minOperations(self, nums: List[int]) -> int:
        n=len(nums)
        target=list(range(n))
        def left_roatate_k(arr,k):
            return arr[k:]+arr[:k]
        ans=float('inf')

        k=nums.index(0)
        if left_roatate_k(nums,k)==target:
            ans=min(ans,min(k,n-k+2))
        rev=nums[::-1]
        k=rev.index(0)
        if left_roatate_k(rev,k)==target:
            ans=min(ans,min(k,n-k)+1)
        return ans if ans!=float('inf') else -1
            


