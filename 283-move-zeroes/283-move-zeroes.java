class Solution {
    public void moveZeroes(int[] nums) {
        int c=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr[c]=nums[i];
                c++;
            }
        }int diff=nums.length-c;
        
        if(diff>0){
            for(int i=0;i<diff;i++){
                arr[c]=0;
                c++;
            }
        }for(int i=0;i<nums.length;i++)nums[i]=arr[i];
        
    }
}