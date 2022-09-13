class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer>hm=new HashMap<>();
        for(int i : nums){
            hm.put(i, hm.getOrDefault(i, 0) +1);
        }
        
        Pair arr[]=new Pair [hm.size()];
        int idx=0;
        for(int i : hm.keySet()) arr[idx ++] = new Pair(i,hm.get(i));
        Arrays.sort(arr);
        int ans[] = new int[nums.length];
        idx=0;
        for(Pair i : arr){
            int ele=i.nums, fre=i.fre;
            while(fre>0){
                ans[idx ++]=ele;
                fre--;
            }
        }return ans;
    }
        class Pair implements Comparable<Pair>{
            int nums;
            int fre;
            public Pair(int nums, int fre){
                this.nums=nums;
                this.fre=fre;
            }
            @Override
            public int compareTo(Pair other){
                if(other.fre==this.fre){
                    return other.nums - this.nums;
                }return this.fre - other.fre;
            }
        }
    
}