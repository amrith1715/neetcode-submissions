class Solution {
    public int scoreOfString(String s) {
        int i,sum=0,len=s.length();
        for(i=0;i<len-1;i++)
        {sum= sum + Math.abs(s.charAt(i)- s.charAt(i+1));
        }
        return sum;
    }
}