class Solution {
    public int maxScore(String s) {
     int score=0,zeros=0,ones=0;
     for(int i=0;i<s.length();i++)
     {
        if(s.charAt(i)=='1')
        ones++;
     }
     for(int i=0;i<s.length()-1;i++)
     {
        if(s.charAt(i)=='1')
        {
            ones--;
        }
        else 
        zeros++;
        score=Math.max(score,zeros+ones);
     }
     return score;
    }
}