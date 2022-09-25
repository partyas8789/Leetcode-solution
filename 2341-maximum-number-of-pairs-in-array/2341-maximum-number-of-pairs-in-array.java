class Solution {
    public int[] numberOfPairs(int[] nums) {
        int pair=0, nonpair=0;
        int ans[]=new int[2];
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i : nums){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        for(int i : hm.keySet()){
            int temp=hm.get(i);
            if(temp%2==0){
                pair=pair+(temp/2);
            }else{
                pair=pair+(temp/2);
                nonpair++;
            }
        }ans[0]=pair;
        ans[1]=nonpair;
        return ans;
    }
}