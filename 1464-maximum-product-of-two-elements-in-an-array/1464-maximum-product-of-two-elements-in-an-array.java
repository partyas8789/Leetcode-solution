class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return (Math.max(((nums[n-1]-1)*(nums[n-2]-1)),((nums[0]-1)*(nums[1]-1))));
        
    }
}