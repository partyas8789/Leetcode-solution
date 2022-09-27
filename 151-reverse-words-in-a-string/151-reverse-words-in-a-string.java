class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        int i = len-1;
        while(i >= 0){
            while(i>=0 && s.charAt(i) == ' '){
                i--;
            }
            
            if(i == -1){
                break;
            }
            int j = i;
            while(j>=0 && s.charAt(j)!=' '){
                j--;
            }
            
            String sub = s.substring(j+1,i+1);
            i=j;
            sb.append(sub);
            sb.append(" ");
        }
        return sb.toString().substring(0,sb.length()-1);
    }
}