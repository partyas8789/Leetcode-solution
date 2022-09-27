class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder();
        int space=s.length();
        int n=spaces.length;
        int j=0;
        for(int i=0;i<space;i++){
            char ch=s.charAt(i);
            if(j<n && ((i)==spaces[j])){
                sb.append(' ');
                sb.append(ch);
                j++;
            }else{
                sb.append(ch);
            }
        }return sb.toString();
    }
}