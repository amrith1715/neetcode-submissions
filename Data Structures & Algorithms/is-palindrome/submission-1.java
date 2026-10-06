class Solution {
    public boolean isPalindrome(String s) {
     String string=s.replaceAll("[^a-zA-Z0-9]","");
     String str=string.toLowerCase();
     char[] original=str.toCharArray();
     char[] original2=original.clone();
     char temp;

     for(int i=0,j=original2.length-1; i<=j; i++,j--)
     { temp=original2[i];
     original2[i]=original2[j];
     original2[j]=temp;

        
     }
      return Arrays.equals(original,original2);
    
        
       

        
    }
}
