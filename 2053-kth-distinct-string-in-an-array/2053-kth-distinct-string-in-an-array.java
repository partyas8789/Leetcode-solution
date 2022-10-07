class Solution {
    public String kthDistinct(String[] arr, int k) {
        String ans="";
        int c=0;
        HashMap<String,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(hm.get(arr[i])==1){
                c++;
                if(c==k){
                    ans=arr[i];
                    return ans;
                }
            }
        }return ans;
    }
}