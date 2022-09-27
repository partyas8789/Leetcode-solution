class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String>hs=new HashMap<>();
        String arr[]=s.split(" ");
        if(pattern.length()!=arr.length) return false;
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(hs.isEmpty()) hs.put(ch,arr[i]);
            else{
                if(hs.containsKey(ch)){
                    if(!hs.get(ch).equals(arr[i])){
                        return false;
                    }else{
                        
                    }
                }else{
                     if(hs.containsValue(arr[i])) return false;
                    hs.put(ch,arr[i]);
                }
            }
        }return true;
    }
}