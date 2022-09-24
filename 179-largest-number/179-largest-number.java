class Solution {
    public String largestNumber(int[] nums) {
        String arr[]=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            String temp=""+nums[i];
            arr[i]=temp;
        }
        sort(arr);
        String ans="";
    for(int i=0;i<arr.length;i++){
        if(ans.length()==0 && Integer.parseInt(arr[i])==0){
            continue;
        }
        ans+=arr[i];
        
    }return ans.length()==0 ? "0":ans;
    }
    public void sort(String arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                String a=arr[i];
                String b=arr[j];
                if((a+b).compareTo(b+a)<0) swap(arr,i,j);
            }
        }
    }
    public void swap(String []arr, int i,int j){
        String temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    
}