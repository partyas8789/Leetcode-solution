class Solution {
    public int minimumSum(int num) {
        int arr[]=new int[4];
        int j=3;
        while(num>0){
            arr[j]=num%10;
            num=num/10;
            j--;
        }
        
        Arrays.sort(arr);
        int a=arr[0]*10+arr[2];
        int b=arr[1]*10+arr[3];
        return (a+b);
    }
}