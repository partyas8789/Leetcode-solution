class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String temp1="";
        String temp2="";
        for(int i=0;i<word1.length;i++){
            temp1+=word1[i];
        }
        for(int i=0;i<word2.length;i++){
            temp2+=word2[i];
        }
        if(temp1.length()!=temp2.length()) return false;
        for(int i=0;i<temp2.length();i++){
            char ch=temp1.charAt(i);
            char ch1=temp2.charAt(i);
            
            if(ch!=ch1)return false;
        }return true;
    }
}