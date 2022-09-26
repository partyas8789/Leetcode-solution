class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int arr[]=new int[temperatures.length];
        Stack<Integer>st=new Stack<>();
        for(int i=temperatures.length-1;i>=0;i--){
            if(st.isEmpty()){
                arr[i]=0;
                st.push(i);
            }else{
                if(temperatures[st.peek()]>temperatures[i]){
                    arr[i]=st.peek()-i;
                    st.push(i);
                }else{
                    while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()]){
                        st.pop();
                    }
                    if(st.isEmpty()){
                        arr[i]=0;
                        st.push(i);
                    }else{
                        arr[i]=st.peek()-i;
                        st.push(i);
                    }
                }
            }
        }return arr;
    }
}