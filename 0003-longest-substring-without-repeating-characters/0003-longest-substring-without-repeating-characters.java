class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int arr[]=new int[256];
        if(n==0 || n==1) return n;
        int ans=0;
        int i=0,j=0;
        arr[s.charAt(j)]=1;
        while(j<n-1){
            if(arr[s.charAt(j+1)]==0){
                arr[s.charAt(j+1)]++;
                j++;
                ans=Math.max(ans, (j-i+1));
            }else{
                arr[s.charAt(i)]--;
                i++;
            }
        }return ans;
    }
}