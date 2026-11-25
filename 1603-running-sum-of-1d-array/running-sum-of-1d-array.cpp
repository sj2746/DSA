class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        int sum=0;
        vector<int> newArr;
        for(int i=0;i<nums.size();i++){
            sum+=nums[i];
            newArr.push_back(sum);
        }
        return newArr;
    }
};