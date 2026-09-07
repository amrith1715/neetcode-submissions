class Solution {
    
    public void reverseString(char[] s) {
        int i,j,len=s.length-1;
        char temp;
        for( i=0,j=len; i<j; i++,j--)
        {
          temp=s[i];
          s[i]=s[j];
          s[j]=temp;
        }
    }
    
}