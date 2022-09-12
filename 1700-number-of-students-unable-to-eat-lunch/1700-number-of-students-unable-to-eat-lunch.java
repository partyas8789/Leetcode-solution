class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n= students.length;
        Queue<Integer>que=new LinkedList<>();
        for(int i=0;i<n;i++){
            que.add(students[i]);
        }
        
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            st.push(sandwiches[i]);
        }
        int nos=n;
        while(nos>0){
            
            int quesize=que.size();
            while(quesize>0 && que.peek()!=st.peek()){
                int bst=que.remove();
                que.add(bst);
                quesize--;
            }
            
            if(quesize==0) return que.size();
            
            if(que.peek()==st.peek()){
                que.remove();
                st.pop();
            }
        }return que.size();
    }
}