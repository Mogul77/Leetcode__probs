class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length-1;
      //  int i =0 , j=n-1;
        int res[] = {-1,-1};
        for(int i =0;i<=n;i++){
            if(nums[i]==target){
            res[0]=i;
            break;
            }
        }
        for(int i = n;i>=0;i-- ){
            if(nums[i]==target){
                res[1]=i;
                break;
            }
        }
        return res;
    }
}