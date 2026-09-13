class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(Character ch:ransomNote.toCharArray())
        {
            if(map1.containsKey(ch))
              map1.put(ch,map1.get(ch)+1);
            else 
              map1.put(ch,1);
        }
        for(Character ch:magazine.toCharArray())
        {
            if(map2.containsKey(ch))
              map2.put(ch,map2.get(ch)+1);
            else 
              map2.put(ch,1);
        }
        boolean check=true;
        for(Character ch:ransomNote.toCharArray())
        {
            if(!map2.containsKey(ch))
            {
                check=false;
                break;
            }
            if(!(map1.get(ch)<=map2.get(ch)))
            {
                check=false;
                break;
                
            }
        }
        return check;
    }
}