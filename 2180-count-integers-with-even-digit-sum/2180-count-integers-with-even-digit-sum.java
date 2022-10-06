class Solution {
    public int countEven(int num) {
        int c=0;
        for(int i=2;i<=num;i++){
            int j=i,tempsum=0;
            while(j>0){
                tempsum=tempsum+j%10;
                j/=10;
            }
            if(tempsum%2==0) c++;
        }return c;
    }
}