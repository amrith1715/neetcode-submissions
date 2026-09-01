class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     int p=0,q=0;   
     for (int i=0;i<nums.length;i++) 
     { if (nums[i]==1)
     {
        p++;
     }
   else 
   {q=Math.max(p,q);
   p=0;
   }
     }
   q=Math.max(p,q);
     
     return q;  
    }
}