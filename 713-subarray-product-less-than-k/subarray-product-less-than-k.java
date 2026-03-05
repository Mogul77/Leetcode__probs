class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for(int end = 0;end<n;end++){
        int prod = 1;
        for(int start = end;start<n;start++){
            prod = prod*nums[start];
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