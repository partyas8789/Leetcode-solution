class Solution {
    public String firstPalindrome(String[] words) {
        String ans="";
        for(int i=0;i<words.length;i++){
            String temp=words[i];
            boolean ans1=check(temp);
            if(ans1==true){
                ans=temp;
                return ans;
            }
        }return "";
    }
    public boolean check(String temp){
        int i=0, j=temp.length()-1;
        while(i<=j){
            char ch=temp.charAt(i);
            char ch1=temp.charAt(j);
            if(ch!=ch1)return false;
            i++;
            j--;
        }return true;
    }
}