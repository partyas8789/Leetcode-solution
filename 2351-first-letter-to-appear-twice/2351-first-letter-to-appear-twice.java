class Solution {
    public char repeatedCharacter(String s) {
        int []arr=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            arr[idx]++;
            if(arr[idx]==2) return ch;
        }return 'a';
    }
}