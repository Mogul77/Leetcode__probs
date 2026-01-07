class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int diff =0;
        int n = nums.length;
        
        for(int i =0;i<=nums[n-1];i++){
            sum = sum + i;
        }
        for(int i = 0;i<nums.length;i++){
            diff = diff+ nums[i];
        }
        int res = sum - diff;
        if(res == 0){
            if(nums[0]==0)
            return nums[n-1]+1;
            else
            return nums[0]-1;
        }
        return res;
    }
}