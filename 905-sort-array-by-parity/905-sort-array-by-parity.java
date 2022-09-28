class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int p1=0,p2=nums.length-1;
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans[p1 ++]=nums[i];
            }else{
                ans[p2 --]=nums[i];
            }
        }return ans;
    }
}