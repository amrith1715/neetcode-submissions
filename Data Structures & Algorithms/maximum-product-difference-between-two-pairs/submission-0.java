class Solution {
    public int maxProductDifference(int[] nums) {
     ArrayList<Integer> list=new ArrayList<>();
     for(int x:nums)
     {
        list.add(x);
     }
     Integer max=Collections.max(list);
     Integer min=Collections.min(list);
     list.remove(max);
     list.remove(min);
     Integer max2=Collections.max(list);
     Integer min2=Collections.min(list);
     return (max*max2)-(min*min2);
    }
}