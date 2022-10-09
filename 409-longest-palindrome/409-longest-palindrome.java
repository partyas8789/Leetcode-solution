class Solution {
    public int longestPalindrome(String str) {
        int []fre=new int[128];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            fre[ch]++;
        }
        for(int i=0;i<128;i++){
            if(fre[i]>0){
                System.out.print(fre[i]+"-"+(char)i+", ");
            }
        }
        System.out.println();
        int sum=0,max=0,k=0;
        for(int i=0;i<128;i++){
            if(fre[i]%2==0){
                sum=sum+fre[i];
            }else{
                int temp=fre[i]-1;
                if(temp>0){
                    k=k+temp;
                }
                max=Math.max(max,fre[i]);
            }
        }if(max>0){
            k=k+1;
        }
        return(sum+k);
    }
}