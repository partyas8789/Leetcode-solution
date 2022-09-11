class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int []arr=new int[nums.length];
        Stack<Integer>st=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i]) st.pop();
            st.push(nums[i]);
        }
        for(int i=nums.length-1;i>=0;i--){
            if(st.isEmpty()) arr[i]=-1;
            else if(st.peek()>nums[i]) arr[i]=st.peek();
            else{
                while(!st.isEmpty() && st.peek()<=nums[i]) st.pop();
                if(st.isEmpty()) arr[i]=-1;
                else if(st.peek()>nums[i]){
                    arr[i]=st.peek();
                }
            }
            st.push(nums[i]);
        }
        return arr;
        
    }
}