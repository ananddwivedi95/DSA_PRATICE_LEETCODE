class Solution {
    public double findMedianSortedArrays(int[] arr, int[] arrr) {
      int[] result=new int[arr.length+arrr.length];
      int i=0;
      int j=0;
      int index=0;
      while(i<arr.length&&j<arrr.length)
      {
         if(arr[i]<=arrr[j])
         {
            result[index++]=arr[i];
            i++;
         }
         else
         {
            result[index++]=arrr[j];
            j++;
         }
      }
      if(i<arr.length)
      {
        while(i<arr.length)
        {
        result[index++]=arr[i];
        i++;
        }
      }
      if(j<arrr.length)
      {
        while(j<arrr.length)
        {
            result[index++]=arrr[j];
            j++;
        }
      }
      double finalResult=0;
      if(result.length%2==0)
      {
        finalResult=(result[result.length/2]+result[(result.length/2)-1])/2.0;
        return finalResult;    
      }
      finalResult=result[result.length/2];
    return finalResult;
    }
}