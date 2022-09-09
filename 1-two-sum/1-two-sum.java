class Solution {
    public int[] twoSum(int[] nums, int target) {
       int n=nums.length;
        int arr[]=new int[2];
        HashMap<Integer, Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i], i);
        }
        for(int i=0;i<n;i++){
            int tar=target-nums[i];
            if(hm.containsKey(tar) && hm.get(tar)!=i){
                arr[0]=i;
                arr[1]=hm.get(tar);
                return arr;
            }
        }return arr;
    }
}