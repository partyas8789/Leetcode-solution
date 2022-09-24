class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int frearr[]=new int[26];
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            frearr[ch-'a']++;
        }
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<s.length()-p.length()+1;i++){
            boolean isfound=true;
            int freans[]=new int[26];
            for(int j=i;j<i+p.length();j++){
                
                char ch=s.charAt(j);
                freans[ch-'a']++;
                if(freans[ch-'a']>frearr[ch-'a']){
                    isfound=false;
                    break;
                }
            }if(isfound) al.add(i);
        }return al;
    }
}