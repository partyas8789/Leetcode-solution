class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if(n>0){
            return posmyPow(x,n);
        }else{
            return negmyPow(x,n);
        }
    }
    public double posmyPow(double x, int n){
        if(n==0){
            return 1;
        }
        double faith= posmyPow(x,n/2);
        if(n%2==0){
            return faith*faith;
        }else{
            return x*faith*faith;
        }
    }
    
    public double negmyPow(double x, int n){
        n=n*-1;
        double ans=posmyPow(x,n);
        return (1/ans);
    }
}