class Solution {
public:
    int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int t1=1,t2=2,step;
        for(int i=3;i<=n;i++){
            step=t1+t2;
            t1=t2;
            t2=step;
        }return step;
    }
};