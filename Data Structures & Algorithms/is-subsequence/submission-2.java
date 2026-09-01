class Solution {
    public boolean isSubsequence(String s, String t)
    {
        Integer pos1=0,pos2=0;
    HashMap<String,Integer> map1=new HashMap<>();
    for (char ch1: s.toCharArray())
    {pos1++;
        map1.put(String.valueOf(ch1),pos1);
    }
    HashMap<String,Integer> map2=new HashMap<>();
    for (char ch2: t.toCharArray())
    {pos2++;
     map2.put(String.valueOf(ch2),pos2);  
    }
    Boolean check;
    int i=0,j=0;
    for (j=0;j<t.length();j++)
    {
        if(i<s.length() && s.charAt(i)==t.charAt(j))
        i++;
    
    }

    return check = i==s.length();
   
    
    }
}