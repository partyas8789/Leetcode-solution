class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        int ans=original;
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        while(hs.contains(ans))
        {
            ans=ans*2;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==ans)
                {
                    ans=nums[i];
                    break;
                }
                if(i==nums.length-1) return ans;
            }
        }return ans;
    }
}