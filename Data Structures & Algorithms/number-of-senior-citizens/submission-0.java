class Solution {
    public int countSeniors(String[] details) {
        int n= details.length;
       int i,j, count=0,age;
       for (i=0;i<n;i++)
       {
             String ages=details[i].substring(11,13);
             age=Integer.parseInt(ages);
             if (age>60)
             count+=1;
       }
       return count;


        
    }
}