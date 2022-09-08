class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum=0;
        int m=nums1.length;
        int n=nums2.length;
        int k=m+n;;
        int []arr=new int[k];
        int i=0,j=0,l=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[l]=nums1[i];
                i++;
            }else{
                arr[l]=nums2[j];
                j++;
            }l++;
        } while(i<m){
            arr[l]=nums1[i];
            i++;
            l++;
        } while(j<n){
            arr[l]=nums2[j];
            j++;
            l++;
        }if(arr.length%2 != 0){
            return arr[l/2];
        }
        
        else{
            return (double)((arr[l/2]) +(arr[l/2-1]))/2;
        }
    }
}