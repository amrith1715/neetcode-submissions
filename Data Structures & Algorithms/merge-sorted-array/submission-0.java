class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m,j=0;
        int temp;

        while(i<nums1.length)
        {
            nums1[i]=nums2[j];
            i++;
            j++;
        }
        Arrays.sort(nums1);
       
        




        }
        
    }
