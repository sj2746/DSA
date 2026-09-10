class Solution {
    public int maxArea(int[] height) {
       int left=0;
       int right=height.length-1;
       int area=0;
       while(left<=right){
        int a=Math.min(height[left],height[right]);
        int b=right-left;
        int contain=a*b;
        area=Math.max(area,contain);
        if(height[left]<=height[right]){
            left++;
        }else{
            right--;
        }
       }
       return area;
    }
}