class Solution {
    public boolean isPowerOfFour(int k) {
        if(k==1) return true;
        int n=k%4;
        if(n==1 || n==2 || n==3 || k<1){
            return false;
        }
        return (isPowerOfFour(k/4));
        
    }
}