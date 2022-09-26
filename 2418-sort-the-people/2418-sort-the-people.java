class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        HashMap<String, Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            String ch=names[i]+"-"+i;
            hm.put(ch, heights[i]);
        }
        Pair []arr=new Pair[n];
        int idx=0;
        for(String name : hm.keySet()){
            arr[idx++]=new Pair(name, hm.get(name));
        }
        Arrays.sort(arr);
        idx=0;
        String []ans=new String[n];
        for(Pair i : arr){
            String ele= i.names;

            ans[idx ++]=ele.split("-")[0];
        }return ans;
    }

        
        class Pair implements Comparable<Pair>{
            String names;
            int heights;
            public Pair(String names, int heights){
                this.names=names;
                this.heights=heights;
            }
            
           @Override
            public int compareTo(Pair other){
                return other.heights - this.heights;
            }
 
        }
    
}