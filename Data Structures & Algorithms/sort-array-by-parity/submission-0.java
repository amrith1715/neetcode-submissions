class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] even= new int[nums.length];
        int[] odd=new int[nums.length];
        int e=0,o=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
            even[e]=nums[i];
            e++;
            }
            else

            { 
            odd[o]=nums[i];
            o++;
            }
        }


        for(int j=0;j<e;j++)
        {
            nums[j]=even[j];
        }
        for(int j=0;j<o;j++)
        {
            nums[e+j]=odd[j];
        }
        return nums;
        
    }
}