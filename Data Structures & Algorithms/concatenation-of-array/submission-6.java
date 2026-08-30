class Solution {
    public int[] getConcatenation(int[] nums) {
      int n=nums.length,i;
      int[] result=new int[2*n];
      for (i=0;i<n;i++)
      { result[i]=nums[i];
        result[n+i]=nums[i];
      }
      return result;
    }
}