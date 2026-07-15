class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int i = 1;i<n;i++){
            String str = s.substring(i,n)+s.substring(0,i);
            if(s.equals(str))return true;
        }
        return false;
    }
}