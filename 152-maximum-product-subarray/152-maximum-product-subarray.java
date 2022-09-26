class Solution {
    public int maxProduct(int[] nums) {
        
        if(nums.length==1) return nums[0];
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int mul=1;
            for(int j=i;j<nums.length;j++){
                mul=mul*nums[j];
                if(ans<mul){
                    ans=mul;
                }
            }
        }
        // for(int i=0;i<nums.length;i++){
        //     if(ans<nums[i]) ans=nums[i];
        // }
        return ans;
        
    }
}