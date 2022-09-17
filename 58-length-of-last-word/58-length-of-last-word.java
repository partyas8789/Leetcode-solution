class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int c=0;
        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            if(c!=0 && ch==' '){
                break;
            }else if (ch!=' '){
                c++;
            }
        }return c;
    }
}