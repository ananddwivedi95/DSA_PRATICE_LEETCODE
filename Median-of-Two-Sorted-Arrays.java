class Solution {
    public double findMedianSortedArrays(int[] arr, int[] arrr) {
        //BRUTE FORCE APPROCH
    //   int[] result=new int[arr.length+arrr.length];
    //   int i=0;
    //   int j=0;
    //   int index=0;
    //   while(i<arr.length&&j<arrr.length)
    //   {
    //      if(arr[i]<=arrr[j])
    //      {
    //         result[index++]=arr[i];
    //         i++;
    //      }
    //      else
    //      {
    //         result[index++]=arrr[j];
    //         j++;
    //      }
    //   }
    //   if(i<arr.length)
    //   {
    //     while(i<arr.length)
    //     {
    //     result[index++]=arr[i];
    //     i++;
    //     }
    //   }
    //   if(j<arrr.length)
    //   {
    //     while(j<arrr.length)
    //     {
    //         result[index++]=arrr[j];
    //         j++;
    //     }
    //   }
    //   double finalResult=0;
    //   if(result.length%2==0)
    //   {
    //     finalResult=(result[result.length/2]+result[(result.length/2)-1])/2.0;
    //     return finalResult;    
    //   }
    //   finalResult=result[result.length/2];
    // return finalResult;

    //better approch
    int i=arr.length-1;
    int j=0;
    while(i>=0&&j<arrr.length)
    {
       if(arr[i]>=arrr[j])
       {
        swap(arr,arrr,i,j);
        i--;
        j++;
       }
       else
       {
          i--;
       }
    }

    Arrays.sort(arr);
    Arrays.sort(arrr);
    int n=arr.length;
    int m=arrr.length;
    double result=0;
    int size=m+n;
     int index=size/2;
    if(size%2==0)
    {
       if (index < n) {
        result = (arr[index] + arr[index - 1]) / 2.0;
        return result;
    } else if (index == n) {
        result = (arr[n - 1] + arrr[0]) / 2.0; // ✅ Fix for edge
        return result;
    } else {
        result = (arrr[index - n] + arrr[(index - n) - 1]) / 2.0;
        return result;
    } 
    }
    
     if(index<n)
     {
       return arr[index];
     }
    
        return arrr[index-n];

    }
    static void swap(int []arr, int []arrr,int first,int last)
    {
        int temp=arr[first];
        arr[first]=arrr[last];
        arrr[last]=temp;
    }
}