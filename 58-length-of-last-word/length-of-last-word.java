class Solution {
    public int lengthOfLastWord(String s) {
        int space = 0 , count =0;
        for(int i = s.length()-1;i>=1;i--){
            if(s.charAt(i)==' ')
            space++;
            else if(s.charAt(i)!=' ')
            break;
        }
        System.out.println(s.length()-1 );
        System.out.print(space);
        int newspace = s.length()-1 - space;
        System.out.print(newspace);
        for(int i = newspace;i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
            count++;
        }

        return count;
    }
}