class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map1 = new HashMap<>();

        for(char ch : s1.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }

        int i = 0 , j = 0;
        HashMap<Character,Integer> map2 = new HashMap<>();
        while(j < s2.length()){
            char ch = s2.charAt(j);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
            if(j-i+1 > s1.length()){ // j-i+1 can never be greater than s1.length() -> if if s2.substring(i,j+1) is permutation of s1
                char rem = s2.charAt(i);
                map2.put(rem,map2.get(rem)-1); // remove
                if(map2.get(rem) == 0){
                    map2.remove(rem);
                }
                i++;
            }
            if(j-i+1 == s1.length() && map1.equals(map2)){
                return true;
            }
            j++;
        }
        return false;
    }
}
