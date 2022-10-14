class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0 || n==-1) return false;
        if(n==1 || n==3)return true;
        // if(n<0) n=n*-1;
        
        while(n>2){
            int rem=n%3;
            if(rem!=0)return false;
            n=n/3;
            System.out.print(n+" ");
            if(n==3) return true;
        }
        return false;
    }
}