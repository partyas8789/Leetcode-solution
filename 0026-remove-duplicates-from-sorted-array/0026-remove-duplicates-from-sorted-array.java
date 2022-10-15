class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0;
        for(int n : nums){
            if(nums[i]<n){
                nums[++i]=n;
            }
        }return i+1;
    }
}