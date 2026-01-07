class Solution {
    public int romanToInt(String s) {
        int tot = 0;
        int prev = 0;
        for(int i =s.length()-1;i>=0;i--){
            int current = getvalue(s.charAt(i));
            if(current < prev){
                tot = tot - current;
            }
            else 
                tot = tot + current;

            prev = current;
        }
        return tot;
    }
      int getvalue(char c){
            if(c=='I')return 1;
            if(c=='V')return 5;
            if(c=='X')return 10;
            if(c=='L')return 50;
            if(c=='C')return 100;
            if(c=='D')return 500;
            return 1000;
        }
}