class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int index=s.lastIndexOf(" ");
        int len=s.length();
        int length=0;
        for(int i=index+1;i<len;i++)
        {length=length+1;
        }
        return length;
    }
}