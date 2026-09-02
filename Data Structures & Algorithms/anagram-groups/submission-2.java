class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<Integer,HashMap<Character,Integer>> outer=new HashMap<>();
        HashMap<Character,Integer> inner;

        for(int i=0;i<strs.length;i++)
        {
            inner=new HashMap<>();

            for(int j=0;j<strs[i].length();j++)
            {
                if(!inner.containsKey(strs[i].charAt(j)))
                {
                    inner.put(strs[i].charAt(j),1);
                }
                else
                {
                    inner.put(strs[i].charAt(j),inner.get(strs[i].charAt(j))+1);
                }
            }

            outer.put(i,inner);
        }

        List<List<String>> outerlist=new ArrayList<>();
        HashSet<Integer> visited=new HashSet<>();

        for(HashMap.Entry<Integer,HashMap<Character,Integer>> map1:outer.entrySet())
        {
            // If this string is already part of a group, skip it
            if(visited.contains(map1.getKey()))
            {
                continue;
            }

            List<String> innerlist=new ArrayList<>();

            for(HashMap.Entry<Integer,HashMap<Character,Integer>> map2:outer.entrySet())
            {
                if(map1.getValue().equals(map2.getValue()))
                {
                    // If not already added, add it
                    if(!visited.contains(map2.getKey()))
                    {
                        innerlist.add(strs[map2.getKey()]);
                        visited.add(map2.getKey());
                    }
                }
            }

            outerlist.add(innerlist);
        }

        return outerlist;
    }
}