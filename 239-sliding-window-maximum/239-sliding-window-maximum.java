class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int ngr[]=ngr(nums);
        int n=nums.length;
        int []ans=new int [n-k+1];
        int j=0, idx=0;
        for(int i=0;i<=n-k;i++){
            if(j<i) j=i;
            while(ngr[j]<i+k){
                j=ngr[j];
            }ans[idx ++]=nums[j];
        }return ans;
        
    }
    public int []ngr(int arr[]){
        int n=arr.length;
        int ans[]=new int [n];
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.empty() && arr[st.peek()]<=arr[i]) st.pop();
            if(st.isEmpty()) ans[i]=n;
            else {
                ans[i]=st.peek();
            }
            st.push(i);
        }return ans;
    }
}