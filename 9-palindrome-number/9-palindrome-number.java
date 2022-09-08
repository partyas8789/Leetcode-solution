class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String str=String.valueOf(x);
        int p1=0;
        int p2=str.length()-1;
        while(p1<=p2){
            char ch=str.charAt(p1);
            char ch1=str.charAt(p2);
            if(ch!=ch1){
                return false;
            }
            p1++;
            p2--;
        }return true;
    }
}