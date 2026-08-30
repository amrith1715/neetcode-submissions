class Solution {
    public boolean hasDuplicate(int[] nums) {
        int i,j,n=nums.length;
        Arrays.sort(nums);
        for (i=0;i<n;i++){
            for (j=i+1;j<n;j++)
            {
                if (nums[i]==nums[j])
                return true;

            }
        }
        return false;
    }
}