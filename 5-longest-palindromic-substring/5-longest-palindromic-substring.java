class Solution {

    public String longestPalindrome(String s) {
        int n=s.length();
        if(n<=1)
        {
            return s;
        }
        int m=0;
        int l=0;
        for(int i=0;i<n;++i)  // future odd length of substring
        {
            int start=i,end=i;
            while(start>=0 && end<n)
            {
                if(s.charAt(start)==s.charAt(end))
                {
                    start--;
                    end++;
                }
                else
                {
                    break;
                }
            }
            if(l<end-start-1)
            {
                l=end-start-1; // length of palindromic substring
                m=start+1;   // starting index of palindromic substring
            }
        }
        for(int i=0;i<n-1;++i)  // future even length of substring
        {
            int start=i,end=i+1;
            while(start>=0 && end<n)
            {
                if(s.charAt(start)==s.charAt(end))
                {
                    start--;
                    end++;
                }
                else
                {
                    break;
                }
            }
            if(l<end-start-1)
            {
                l=end-start-1; // length of palindromic substring
                m=start+1;   // starting index of palindromic substring
            }
        }
        return s.substring(m,m+l);
    

        
    }
}