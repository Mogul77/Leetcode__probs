class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        double winsum=0;
        for(int i=0;i<k;i++){
            winsum+=nums[i];
        }double max_sum=winsum;
        for(int i=k;i<nums.size();i++){
            winsum+=nums[i]-nums[i-k];
            max_sum=max(max_sum,winsum);
        }
        return max_sum/k;
    }
};