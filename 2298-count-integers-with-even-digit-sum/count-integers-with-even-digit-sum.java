class Solution {
    public int countEven(int num) {
        int count =0;
        for(int i=2;i<=num;i++){
            int temp =i;int sum = 0;
           // System.out.print(temp+" ");
            while(temp!=0){
                int dig = temp%10;
                 sum +=dig;
                temp = temp/10;
            }
                if(sum%2==0){
                   // System.out.print(sum+" ");
                    count++;
                }
            
        }
        return count;
    }
}