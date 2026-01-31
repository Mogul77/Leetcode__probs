class Solution {
    public int[] sortedSquares(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            nums[i] = Math.abs(nums[i])*Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        return nums;
    }
}