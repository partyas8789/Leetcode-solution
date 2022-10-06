class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        ArrayList<List<Integer>>al=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            int temp=arr[i]-arr[i-1];
            min=Math.min(min,temp);
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==min){
                al.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }return al;
    }
}