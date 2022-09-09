class Solution {
    public int largestRectangleArea(int[] heights) {
        return maxarea(heights);
    }
    public int [] nsl(int []arr){
        int n=arr.length;
        int []ans=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]) st.pop();
            if(st.isEmpty()) ans[i]=-1;
            else ans[i]=st.peek();
            st.push(i);
        }return ans;
    }
    
    public int [] nsr(int []arr){
        int n=arr.length;
        int []ans=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]) st.pop();
            if(st.isEmpty()) ans[i]=n;
            else ans[i]=st.peek();
            st.push(i);
        }return ans;
    }
    
    public int maxarea(int []arr){
        int n=arr.length;
        int []ansr=nsr(arr);
        int []ansl=nsl(arr);
        int max=0;
        for(int i=0;i<n;i++){
            int area=(ansr[i]-ansl[i]-1)*arr[i];
            max=Math.max(area,max);
        }return max;
        
    }
}