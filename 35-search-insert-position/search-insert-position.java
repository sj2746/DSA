class Solution {
    public int searchInsert(int[] nums, int target) {
        boolean found=false;
        int position=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                found=true;
                position= i;
                break;
                
            }
        }
        if(!found){
            for(int i=0;i<=nums.length-1;i++){
                if(nums[i]>target){
                    position=i;
                    break;
                }else if(target>nums[nums.length-1]){
                    position=nums.length;
                    break;
                }
            }
        }
        return position;
    }
}