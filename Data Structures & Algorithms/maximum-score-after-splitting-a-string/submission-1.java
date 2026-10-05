class Solution {
    public int maxScore(String s) {
        String left,right;
        int score,max=0,l,r;

        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        for(int i=1;i<s.length();i++)
        {
            left=s.substring(0,i);

            right=s.substring(i);
            for(Character c :left.toCharArray())
            {
                map1.put(c,map1.getOrDefault(c,0)+1);
            }

            for(Character c : right.toCharArray())
            {
                map2.put(c,map2.getOrDefault(c,0)+1);
            }

            score=map1.getOrDefault('0',0)+map2.getOrDefault('1',0);

            if(score>max)
            {
                max=score;
            }
            map1.clear();
            map2.clear();
        }
        return max;
        
    }
}