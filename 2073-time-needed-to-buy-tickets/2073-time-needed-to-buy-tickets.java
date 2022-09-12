class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets.length;
        Queue<Integer>que=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(i==k){
                que.add(-1*tickets[i]);
            }else{
                que.add(tickets[i]);
            }
            
        }
        int time=0;
        while(que.size()>0){
            int fe=que.remove();
            if(fe==-1) return time+1;
            if(fe<0){
                fe++;
                
            }else if(fe>0){
                fe--;
                
            }
            if(fe!=0){
                que.add(fe);
            }
            time++;
        }return time;
    }
}