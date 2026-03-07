class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int sum = nums[0]+nums[1]+nums[2];
        for(int i = 0;i<n-2;i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                int close = nums[i]+nums[left]+nums[right];
                if(Math.abs(close-target)<Math.abs(sum-target)){
                    sum = close;
                }
                if(close<target){
                    left++;
                }
                else if(close>target){
                    right--;
                }
                else{
                    return close;
                }
            }
        }
        return sum;        
    }
}