class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans=new StringBuilder();
        String temp=strs[0];
        for(int i=0;i<temp.length();i++){
            char ch=temp.charAt(i);
            for(int j=1;j<strs.length;j++){
                String temp2=strs[j];
                if(i<temp2.length()){
                    char ch1=temp2.charAt(i);
                    if(ch!=ch1){
                        return ans.toString();
                    }
                }else{
                    return ans.toString();
                }
                
                
            }ans.append(ch);
        }return ans.toString();
    }
}