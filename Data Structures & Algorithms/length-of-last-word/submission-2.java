class Solution {
    public int lengthOfLastWord(String s) {
         int index=s.lastIndexOf(" ");
        int len=s.length();
        if (index==len-1)
        {
        s=s.trim();
        int index2=s.lastIndexOf(" ");
        int len2=s.length();
        int length2=0;
        for(int i=index2+1;i<len2;i++)
        {length2=length2+1;
        }
        return length2;
        }
        int length=0;

        for(int i=index+1;i<len;i++)
        {length=length+1;
        }
        return length;
        
    }
}