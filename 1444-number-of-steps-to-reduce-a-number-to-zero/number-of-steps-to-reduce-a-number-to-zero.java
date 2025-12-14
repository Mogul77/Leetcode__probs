class Solution {
    public int numberOfSteps(int num) {
        int step =0;
        int tem = num;
        while(num!=0){
            num = num/2;
            step++;
            if(num%2!=0){
            num = num-1;
            step++;
            } 
        } if(tem%2!=0){
            step=step+1;
        }
        return step;
        
    }
}