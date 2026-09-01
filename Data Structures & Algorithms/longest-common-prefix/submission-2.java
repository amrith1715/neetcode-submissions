class Solution {
    public String longestCommonPrefix(String[] strs) {
        HashMap<String,Integer> map=new HashMap<>();
        for (String str:strs)
        {
            if(!map.containsKey(str))
            {
                map.put(str,str.length());
            }
        }
        int minlen=Collections.min(map.values());
        while(minlen>0)
        {
            ArrayList<String> list=new ArrayList<>();

             for(String s:strs)
        {
            list.add(s.substring(0,minlen));
        }
         boolean same=true;

            for(int i=1;i<list.size();i++)
            {if (!list.get(i).equals(list.get(0)))
            {
            same=false;
            break;
            }

            }
       
        if (same==true)
            return list.get(0);
        else 
            minlen--;
        
    }
      return "";    
    }
}
    
