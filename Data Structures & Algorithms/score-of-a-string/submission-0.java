class Solution {
    public int scoreOfString(String s) {
       String str=s;
        int i;
        int len=str.length();
        int sum=0;
        for(i=0;i<len-1;i++)
        {sum= sum + Math.abs((int)str.charAt(i)- str.charAt(i+1));

        }
        return sum;

    }
}