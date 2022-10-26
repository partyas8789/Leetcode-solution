class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.charAt(0)>='A' && word.charAt(0)<='Z'){
            if(word.charAt(word.length()-1)>='A' && word.charAt(word.length()-1)<='Z'){
               for(int i=1;i<word.length();i++){
                    char ch=word.charAt(i);
                    if(ch>='a' && ch<='z')return false;
                    }
               
               }else{
                   for(int i=1;i<word.length();i++){
                    char ch=word.charAt(i);
                    if(ch>='A' && ch<='Z')return false;
                    }
               }
        }else{
            for(int i=1;i<word.length();i++){
                char ch=word.charAt(i);
                if(ch>='A' && ch<='Z')return false;
            }
        }return true;
    }
}