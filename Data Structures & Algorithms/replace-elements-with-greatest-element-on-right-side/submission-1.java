class Solution {
    public int[] replaceElements(int[] arr) {
        int i,j,max,n=arr.length;
        for (i=0;i<n-1;i++)
        { max=arr[i+1];
            for(j=i+1;j<n;j++)
            {
                if (arr[j]>max)
                    max=arr[j];
                
            }
            arr[i]=max;

        }
        arr[n-1]=-1;
        return arr;
        
    }
}