class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0,k=0;
        String merged;
        char[] m= new char[word1.length() + word2.length()];
        while(i<word1.length() && j<word2.length())
        {  
            m[k]=word1.charAt(i);
            i++;
            m[k+1]= word2.charAt(j);
            j++;
            k=k+2;
        }
        while(i>=word2.length() && i<word1.length())
        {
            m[k]=word1.charAt(i);
            i++;
            k++;
        }

         while(j>=word1.length() && j<word2.length())
        {
            m[k]=word2.charAt(j);
            j++;
            k++;
        }
        merged= new String(m);
        return merged;

        
    }
}