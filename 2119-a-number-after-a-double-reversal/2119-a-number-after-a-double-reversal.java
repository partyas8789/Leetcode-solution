class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num;
        int revno=rev(temp);
        int ans=rev(revno);
        if(ans==num){
            return true;
        }
        return false;
    }
    public int rev(int temp){
        int rev1=0;
        while(temp>0){
            rev1=rev1*10+temp%10;
            temp/=10;
        }return rev1;
    }
}