class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i : nums){
            if(i%2==0){
                hm.put(i, hm.getOrDefault(i,0)+1);
            }
        }
        Pair []arr=new Pair[hm.size()];
        int idx=0;
        for(int i : hm.keySet()){
            arr[idx ++]=new Pair(i, hm.get(i));
        }
        Arrays.sort(arr);
        if(hm.isEmpty()) return -1;
        int ans=-1;
        for(Pair i : arr){
            ans=i.num;
            return ans;
        }return ans;
    }
            
            
        class Pair implements Comparable<Pair>{
            int num;
            int fre;
            public Pair(int num, int fre){
                this.num=num;
                this.fre=fre;
            }
            @Override
            public int compareTo(Pair other){
                if(this.fre==other.fre){
                    return this.num- other.num;
                }return other.fre-this.fre;
            }
        }
    
}