class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            arr[i]=sum;
        }
        for(int j=0;j<n;j++){
            if(j==0){
                if(arr[n-1]-arr[j]==0){
                    return j;
                }
            }else if(arr[j-1]==arr[n-1]-arr[j]){
                return j;
            }
        }return -1;
    }
}