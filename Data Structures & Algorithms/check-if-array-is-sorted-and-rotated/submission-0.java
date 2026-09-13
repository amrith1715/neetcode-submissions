class Solution {

    public static  boolean isSorted(int[] nums)
    {
        boolean sorted=true;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                sorted=false;
                break;
            }
        }
        return sorted;
    }
    public boolean check(int[] nums) {
        int length=nums.length;
        int shifts=0;
        while(!isSorted(nums) && shifts<=length)
        {int temp=nums[length-1];
        for(int j=length-1;j>=1;j--)
        {

            nums[j]=nums[j-1];
        }
        nums[0]=temp;
        shifts +=1;
        }
         return (isSorted(nums)); 
    }
}