class Solution {
    public int hammingWeight(int n) {
        int bit =0;int count=0;
        String bin ="";
        while(n!=0){
            int last = n%2;
            bin = bin+last;
            n=n/2;
        }
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='1')
            count++;
        }
        return count;
    }
}