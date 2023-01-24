class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length==1)return false;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[index]) index=i;
        }
        if(index==0 || index==arr.length-1) return false;
        for(int i=0;i<index-1;i++){
            if(arr[i]>=arr[i+1])return false;
        }
        for(int i=index;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1])return false;
        }return true;
    }
}