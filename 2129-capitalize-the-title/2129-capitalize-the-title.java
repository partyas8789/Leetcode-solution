class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb=new StringBuilder();
        String []arr=title.split(" ");
        for(int i=0;i<arr.length;i++){
            String temp=arr[i];
            if(temp.length()>2){
                for(int j=0;j<temp.length();j++){
                    char ch=temp.charAt(j);
                    if(j==0){
                        sb.append(Character.toUpperCase(ch));
                    }else{
                        sb.append(Character.toLowerCase(ch));
                    }
                }if(i!=arr.length-1)sb.append(' ');
                
            }else{
                for(int j=0;j<temp.length();j++)
                {
                    char ch=temp.charAt(j);
                    sb.append(Character.toLowerCase(ch));
                }if(i!=arr.length-1)sb.append(' ');
            }
        }return sb.toString();
    }
}