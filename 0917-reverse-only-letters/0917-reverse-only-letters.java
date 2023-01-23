class Solution {
    public String reverseOnlyLetters(String s) {
        Stack <Character>st =new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z')){
                st.push(ch);
            }
        }
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z')){
                char temp=st.pop();
                ans=ans+temp;
            }else{
                ans=ans+ch;
            }
        }
        return ans;
    }
    
}