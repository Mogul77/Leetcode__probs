class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = -10000;
        for(int start = 0;start<n;start++){
            int prod = 1;
            for(int end = start;end<n;end++){
                prod*=nums[end];
                if(prod>max){
                    max = prod;
                }
            }
        }
        return max;
    }
}