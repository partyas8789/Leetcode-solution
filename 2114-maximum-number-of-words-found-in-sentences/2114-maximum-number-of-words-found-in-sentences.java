class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        int n=sentences.length;
        String temp[]=new String[n];
        for(int i=0;i<n;i++){
            temp[i]=sentences[i];
        }
        for(int i=0;i<temp.length;i++){
            String ans[]=temp[i].split(" ");
            max=Math.max(max,ans.length);
        }return max;
    }
}