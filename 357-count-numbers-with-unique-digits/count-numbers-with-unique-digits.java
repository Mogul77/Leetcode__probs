class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;

        int total = 10;          
        int product = 9;         
        int available = 9;       
        for (int digits = 2; digits <= n && digits <= 10; digits++) {
            product *= available; 
            total += product;       
            available--;            
        }

        return total;
    }
}
