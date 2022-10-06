class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        for(int i=0;i<words.length;i++){
            String temp=words[i];
            boolean ans=check(temp,pref);
            if(ans)c++;
            
        }
        return c;
    }
    public boolean check(String temp, String pref){
        if(temp.length()<pref.length()) return false;
        for(int j=0;j<pref.length();j++){
            char ch=pref.charAt(j);
            char ch1=temp.charAt(j);
            if(ch!=ch1) return false;
        }return true;
    }
}