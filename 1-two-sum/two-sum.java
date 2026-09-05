class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Initailized to zero
        int sum=0;
       for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums.length;j++){
            if(nums[i]+nums[j]==target && i!=j){
                return new int[]{i,j};
            }
        }
       } 
       return new int[]{};
    }
}