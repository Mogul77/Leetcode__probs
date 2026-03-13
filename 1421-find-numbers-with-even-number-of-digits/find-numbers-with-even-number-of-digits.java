class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int res = 0;
        for(int i = 0;i<n;i++){
        int count = 0;
            while(nums[i]>0){
                int dig = nums[i]%10;
                count++;
                nums[i]=nums[i]/10;
            }
            if(count%2==0){
                res++;
            }
        }
        return res;
    }
}