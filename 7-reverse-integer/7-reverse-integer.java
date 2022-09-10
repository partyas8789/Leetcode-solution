class Solution {
    public int reverse(int x) {
        long ans=0;
        int quit=x;
        if(x<0){
            quit*=-1;
        }
        
        while(quit>0){
            int rem=quit%10;
            ans=ans*10+rem;
            quit/=10;
        }
        if(ans > Integer.MAX_VALUE){
            return 0;
        }
        if(x<0){
            ans*=-1;
            if(ans < Integer.MIN_VALUE){
                return 0;
            }
        }return (int)ans;
    }
}