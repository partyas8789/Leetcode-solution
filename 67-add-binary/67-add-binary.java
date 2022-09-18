class Solution {
    public String addBinary(String a, String b) {
        int carry=0;
        StringBuilder sb=new StringBuilder();
        int i=a.length()-1, j=b.length()-1;
        while(i>=0 || j>=0){
            int c=0;
            int c1=0;
            if(i>=0){
                c=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                c1=b.charAt(j)-'0';
                j--;
            }
            int sum=c+c1+carry;
            if(sum==3){
                sb.insert(0,1);
                carry=1;
            }else if(sum==2){
                sb.insert(0,0);
                carry=1;
            }else if(sum==1){
                sb.insert(0,1);
                carry=0;
            }else if(sum==0){
                sb.insert(0,0);
                carry=0;
            }
        }
        if(carry>0){
            sb.insert(0,1);
        }
        return sb.toString();
    }
}