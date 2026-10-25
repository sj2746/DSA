class Solution {
    public int sumOfSquares(int[] nums) {
        int sq=0;
        for(int i=1;i<=nums.length;i++){
            if(nums.length%i==0){
                sq+=nums[i-1]*nums[i-1];
            }
        }
        return sq;
        
    }
    
}