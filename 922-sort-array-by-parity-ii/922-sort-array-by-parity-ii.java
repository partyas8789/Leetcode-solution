class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int evenarr[]=new int[n/2];
        int oddarr[]=new int[n/2];
        int a=0,b=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                evenarr[a]=nums[i];
                a++;
            }else{
                oddarr[b]=nums[i];
                b++;
            }
        }
        a=0;
        b=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                ans[i]=evenarr[a];
                a++;
            }else{
                ans[i]=oddarr[b];
                b++;
            }
            
        }return ans;
    }
}