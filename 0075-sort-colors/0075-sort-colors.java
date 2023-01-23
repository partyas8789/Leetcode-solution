class Solution {
    public void sortColors(int[] nums) {
        int p0=0;
        int i=0;
        int p2=nums.length-1;
        while(i<=p2){
            if(nums[i]==0){
                swap(p0,i,nums);
                i++;
                p0++;
            }else if(nums[i]==2){
                swap(p2,i,nums);
                p2--;
            }else{
                i++;
            }
        }
    }
        
    
    public void swap(int a, int b, int []nums){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
        
    
}