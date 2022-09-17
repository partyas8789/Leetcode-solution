class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0, e=nums.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                ans=mid;
                return ans;
            }else if(nums[mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        // if(ans==-1){
        //     int temp=check(nums,target);
        //     ans=temp;
        // }
        return s;
    }
    
    public int check(int[] nums, int target) {
        int s=0, e=nums.length-1;
        int ans=nums.length;
        if(nums[nums.length-1]<target){
            return ans;
        }
        while(s<e){
            int mid=s+(e-s)/2;
            if(nums[mid]<target){
                s=mid;
                ans=s;
            }else{
                e=mid-1;
                ans=e+1;
            }
        }return ans;
    }
}