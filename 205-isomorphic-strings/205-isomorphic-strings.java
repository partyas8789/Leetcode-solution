class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m) return false;
        HashMap<Character, Character>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            char ch1=t.charAt(i);
            if(hm.containsKey(ch)){
                if(hm.get(ch)!=ch1) return false;
            }else{
                if(hm.containsValue(ch1)) return false;
                hm.put(ch, ch1);
            }
        }return true;
    }
}