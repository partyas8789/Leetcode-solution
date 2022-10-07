class Solution {
    public int minimumCost(int[] cost) {
        int sum=0;
        Arrays.sort(cost);
        int j=1;
        for(int i=cost.length-1;i>=0;i--){
            if(j%3!=0){
                sum+=cost[i];
            }j++;
        }return sum;
    }
}