class Solution {
    public int compress(char[] chars) {

        int n = chars.length;
        StringBuilder res = new StringBuilder();

        int i = 0;

        while(i < n){

            char curr = chars[i];
            int count = 0;

            while(i < n && chars[i] == curr){
                count++;
                i++;
            }

            res.append(curr);

            if(count > 1){
                res.append(count);
            }
        }

        for(int j = 0; j < res.length(); j++){
            chars[j] = res.charAt(j);
        }

        return res.length();
    }
}