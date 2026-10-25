class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int sq=0,add=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sq+=findsquare(i,nums);
            }
        }
        return sq;
        
    }
    private static int findsquare(int i,int[] nums){
            return nums[i-1]*nums[i-1];
        }
}