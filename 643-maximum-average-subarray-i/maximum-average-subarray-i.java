class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double max = -1000000;
        for(int start = 0;start<=n-k;start++){
            int sum = 0;
            for(int end = start;end<start+k;end++){
                sum = sum+nums[end];
            }
            double avg = (double) sum/k;
            if(avg>max){
                max = avg;
            }
        }
        return max;
    }
}