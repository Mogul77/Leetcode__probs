class Solution {
    public String trimTrailingVowels(String s) {
        int n = s.length();
        int l=-1;
        StringBuilder sb = new StringBuilder();
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                continue;
            }
            else{
                l = i;
                break;
            }
        }
        for(int j = l;j>=0;j--){
            sb.append(s.charAt(j));
        }
         sb.reverse();
         return sb.toString();
    }
}