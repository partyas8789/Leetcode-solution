class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        int mid=n/2;
        int c=mid;
        int []oddarr=new int[mid];
        if(n%2!=0){
            c=c+1;
        }
        int []evenarr=new int[c];
        int []ans=new int[n];
        int a=0, b=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                evenarr[a]=nums[i];
                a++;
            }else{
                oddarr[b]=nums[i];
                b++;
            }
        }
        Arrays.sort(evenarr);
        Arrays.sort(oddarr);
        a=0;
        b=mid-1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                ans[i]=evenarr[a];
                a++;
            }else{
                ans[i]=oddarr[b];
                b--;
            }
        }return ans;
        
    }
}