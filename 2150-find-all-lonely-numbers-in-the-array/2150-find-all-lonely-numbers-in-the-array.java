class Solution {
    public List<Integer> findLonely(int[] nums) {
        ArrayList<Integer>al=new ArrayList<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i]+1) && !hm.containsKey(nums[i]-1)){
                if(hm.get(nums[i])==1){
                    al.add(nums[i]);
                }
                
            }
        }return al;
    }
}