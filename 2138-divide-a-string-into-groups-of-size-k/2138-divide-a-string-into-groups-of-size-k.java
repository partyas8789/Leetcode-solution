class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length();
        int rem=(n%k);
        int m=n/k;
        if(rem>0) m=m+1;
        String ans[]=new String[m];
        int j=0,idx=0;
        while(j<n){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<k;i++){
                if(j<n){
                    char ch=s.charAt(j);
                    sb.append(ch);
                }else{
                    sb.append(fill);
                }
                
                j++;
            }ans[idx]=sb.toString();
            idx++;
        }return ans;
    }
}