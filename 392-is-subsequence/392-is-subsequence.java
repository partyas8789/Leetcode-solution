class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length(), m=t.length();
        int i=0, j=0;
        while(i<n && j<m){
            char ch=s.charAt(i);
            char ch1=t.charAt(j);
            if(ch==ch1){
                i++;
            }
            j++;
        }if(i<n){
            return false;
        }else{
            return true;
        }
    }
}