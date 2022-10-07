class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            HashSet<Integer>hs=new HashSet<>();
            for(int j=0;j<n;j++){
                hs.add(matrix[i][j]);
                hm.put(matrix[i][j], hm.getOrDefault(matrix[i][j], 0)+1);
            }if(hs.size()!=n)return false;
        }
        for(int i=0;i<n;i++){
            HashSet<Integer>hs=new HashSet<>();
            for(int j=0;j<n;j++){
                hs.add(matrix[j][i]);
            }if(hs.size()!=n)return false;
        }
        for(int i : hm.keySet()){
            if(hm.get(i)!=n)return false;
        }return true;
    }
}