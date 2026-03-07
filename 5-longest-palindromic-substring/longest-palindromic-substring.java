class Solution {
    public String longestPalindrome(String s) {
        String longe = "";
        int n = s.length();
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                String sub = s.substring(i,j+1);
                if(ispal(sub)&& sub.length()>longe.length()){
                    longe = sub;
                }
            }
        }
        return longe;
    }
    public boolean ispal(String str){
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;

            }
            left++;right--;
        }
        return true;
    }
}
