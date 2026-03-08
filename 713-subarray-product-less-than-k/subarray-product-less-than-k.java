class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        
        for(int start=0;start<n;start++){
            int prod = 1;
            for(int end=start;end<n;end++){
                prod = prod*nums[end];
                if(prod<k){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}