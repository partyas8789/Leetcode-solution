class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>hm=new HashMap<>();
        for(String ans:strs){
            char []arr=ans.toCharArray();
            Arrays.sort(arr);
            String temp=new String(arr);
            if(!hm.containsKey(temp)) hm.put(temp,new ArrayList<>());
            hm.get(temp).add(ans);
        }return new ArrayList<>(hm.values());
        
    }
}