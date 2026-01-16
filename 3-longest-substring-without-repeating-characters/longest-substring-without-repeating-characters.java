class Solution {
    public int lengthOfLongestSubstring(String s) {
       String st="";
        int max =0;
        for(int i =0;i<s.length();i++)
        {
            boolean test[]=new boolean[256];
            int en = 0;
            for(int j =i ;j<s.length();j++)
            {
                if(test[s.charAt(j)])
                {
                    break;
                }
                test[s.charAt(j)]=true;
                en++;
            }
            max= Math.max(max , en);
        }
        return max;
    }
}