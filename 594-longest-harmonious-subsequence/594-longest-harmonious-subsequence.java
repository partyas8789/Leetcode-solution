class Solution {
    public int findLHS(int[] arr) {
        int n=arr.length;
        HashMap<Integer, Integer>hm=new HashMap<>();
        int length=0;
        for(int i=0;i<n;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) +1);
        }
        for(int i : hm.keySet()){
            if(hm.containsKey(i+1)){
                int temp=(hm.get(i+1)+hm.get(i));
                length=Math.max(length, temp);
            }
        }return length;
    }
}