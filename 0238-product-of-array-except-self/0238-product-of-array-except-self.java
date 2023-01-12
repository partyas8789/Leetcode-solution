class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        int mul=1;
        int zero=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                 mul=mul*nums[i];
            }
            if(nums[i]==0){
                zero=1;
                c++;
            }
           
        }
        for(int i=0;i<nums.length;i++){
            if(c>1){
                ans[i]=0;
            }
            else if(zero==1){
                if(nums[i]==0){
                    ans[i]=mul;
                }else{
                    ans[i]=0;
                }
            }else{
                ans[i]=mul/nums[i];
            }
            
            
        }
        return ans;
    }
}