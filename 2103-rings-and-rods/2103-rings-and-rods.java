class Solution {
    public int countPoints(String rings) {
        HashSet<Integer>hs1=new HashSet<>();
        HashMap<Integer,HashSet<Character>>hm=new HashMap<>();
        for(int i=0;i<rings.length()-1;i=i+2){
            int num=rings.charAt(i+1)-'0';
            char ch1=rings.charAt(i);
            if(hm.containsKey(num)){
                HashSet<Character>hs=hm.get(num);
                hs.add(ch1);
                if(hs.size()==3){
                    hs1.add(num);
                }
                hm.put(num,hs);
            }else{
                HashSet<Character>hs=new HashSet<>();
                hs.add(ch1);
                if(hs.size()==3){
                    hs1.add(num);
                }
                hm.put(num,hs);
            }
        }
        return hs1.size();
    }
}