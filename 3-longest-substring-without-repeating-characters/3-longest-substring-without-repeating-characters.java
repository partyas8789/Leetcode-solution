class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int arr[]=new int[256];
        if(n==0)return 0;
        if(n==1){
            return 1;
        }
        int ans=0,i=0,j=0;
        arr[s.charAt(j)]=1;
        while(j<n-1)
        {
            if(arr[s.charAt(j+1)]==0)
            {
                arr[s.charAt(j+1)]++;
                j++;
                ans=Math.max(ans,j-i+1);
            }
            else
            {
                arr[s.charAt(i)]--;
                i++;
            }
        }
        return ans;
    }
}