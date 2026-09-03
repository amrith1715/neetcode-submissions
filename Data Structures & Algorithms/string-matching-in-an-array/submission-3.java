class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            list.add(words[i]);
        }
        for(String str1:list)
        {
            for(String str2:list)
            {
                if(str2.contains(str1) &&!str1.equals(str2)&& !list2.contains(str1))
                {
                    list2.add(str1);
                }
            }
        }

       return list2;
    }
}