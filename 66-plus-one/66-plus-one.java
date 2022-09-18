class Solution {
    public int[] plusOne(int[] arr) {
        StringBuilder sb=new StringBuilder();
        int carry=0, b=1, c=0;
        for(int i=arr.length-1; i>=0;i--){
            int digit=arr[i]+carry+b;
            b=0;
            carry=digit/10;
            int rem=digit%10;
            sb.insert(0,rem);
            c++;
        }if(carry>0){
            sb.insert(0,carry);
            c++;
        }
        String str=sb.toString();
        int arrs[]=new int[c];
        for(int i=0; i<c;i++){
            char ch=str.charAt(i);
            int k=ch-'0';
            arrs[i]=k;
        }
        
        return arrs;
    }
}