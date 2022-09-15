class Solution {
    public int minSteps(String s, String t) {
        int arr[]=new int[26];
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            arr[idx]++;
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            int idx=ch-'a';
            if(arr[idx]==0){
                c++;
            }else{
                arr[idx]--;
            }
        }
        for(int i: arr){
             c+=i;
        }return c/2;
    }
}