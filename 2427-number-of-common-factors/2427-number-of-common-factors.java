class Solution {
    public int commonFactors(int a, int b) {
        int x=0,c=0;
        if(a<b) x=a;
        else if(a==b) x=a;
        else x=b;
        for(int i=x;i>=1;i--){
            if(a%i==0 && b%i==0) c++;
        }return c;
    }
}