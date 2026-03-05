class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
          for(int end =0;end<n;end++){
            int sum = 0;
            for(int start =end;start<n;start++){
                sum=sum+nums[start];
                if(sum==k){
                    count++;
                }
            }
          }
          return count;
    }
}