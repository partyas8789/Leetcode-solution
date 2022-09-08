class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] {bsfo(nums,target,true),bsfo(nums,target,false)};
    }public int bsfo(int[] nums, int target,boolean focc){
        int p1=0,p2=nums.length-1;
        int c=-1;
        while(p1<=p2){
            int mid=p1+(p2-p1)/2;
            if(nums[mid]==target){
                c=mid;
                if(focc)p2=mid-1;
                else p1=mid+1;
            }else if (nums[mid]<target){
                p1=mid+1;
            }else{
                p2=mid-1;
            }
        }return c;
    }
}