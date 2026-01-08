class Solution {
    public boolean isHappy(int n) {
        if(n==7)
        return true;
        int temp = n;
        int sum =0;
        while(temp>9){
        sum=0;
        while(temp!=0){
            int dig = temp%10;
            sum = sum+dig*dig;
            temp = temp/10;
        }
        if(sum==7)
        return true;
        System.out.println(sum);
        temp = sum;
        }
        if(temp == 1)
        return true;
        else
        return false;
        
    }
}