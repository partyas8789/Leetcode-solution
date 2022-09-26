class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        Stack<int []>st=new Stack<>();
        for(int [] i : intervals){
            if(st.isEmpty()) st.push(i);
            else{
                if(st.peek()[1]>=i[0]){
                    int []temp=st.pop();
                    int []k=new int[2];
                    k[0]=temp[0];
                    k[1]=Math.max(temp[1],i[1]);
                    st.push(k);
                }else{
                    st.push(i);
                }
            }
        }int [][]ans=new int[st.size()][2];
        int idx=0;
        for(int[] i : st){
            ans[idx++]=i;
        }return ans;
    }
}