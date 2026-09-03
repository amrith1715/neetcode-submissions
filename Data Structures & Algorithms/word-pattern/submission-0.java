class Solution {
    public boolean wordPattern(String pattern, String s) {
        ArrayList<String> list =new ArrayList<>(Arrays.asList(s.split(" ")));
        
        ArrayList<Character> list2=new ArrayList<>();

         for(int i=0;i<pattern.length();i++)
        {
            list2.add(pattern.charAt(i));
        }

     
        HashMap<Character,String> map=new HashMap<>();

        if(list.size()!=list2.size())
        return false;

        for(int i=0;i<pattern.length();i++)
        { if(map.containsKey(list2.get(i)))
        {
            if(!map.get(list2.get(i)).equals(list.get(i)))
            return false;
        }
        else 
        {
            if(map.containsValue(list.get(i)))
            return false;

        }
           map.put(list2.get(i),list.get(i));

        }
        return true;   
    }
}