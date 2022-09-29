class Solution {
    public int longestContinuousSubstring(String s) {
        int max=1;
        int c=1;
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            char ch1=s.charAt(i-1);
            if(ch1+1==ch){
                c++;
                max=Math.max(c,max);
            }else{
                max=Math.max(c,max);
                c=1;
            }
        }return max;
    }
}