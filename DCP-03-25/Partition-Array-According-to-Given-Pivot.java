class Solution {
    public int[] pivotArray(int[] arr, int pivot) {
       int ii=0;
       ArrayList<Integer> smallest=new ArrayList<>();
       ArrayList<Integer> mid=new ArrayList<>();
       ArrayList<Integer> greater= new ArrayList<>();
       while(ii<arr.length)
       {
           if(arr[ii]<pivot)
           {
               smallest.add(arr[ii]);
               ii++;
           }
           else if(arr[ii]==pivot)
           {
               mid.add(arr[ii]);
               ii++;
           }
           else if(arr[ii]>pivot)
           {
               greater.add(arr[ii]);
               ii++;
           }

       }
      int [] result= new int[arr.length];
       int i=0; //for smallest ArrayList
       int j=0; // for mid ArrayList
       int k=0; //for greater ArrayList
       int index=0;
       int sLength=smallest.size();
       int mLength=mid.size();
       int gLength=greater.size();
       int n=result.length;
       while(index<n)
       {
           if(index<sLength)
           {
               result[index]= smallest.get(i);
               index++;
               i++;
           }
           else if(index<sLength+mLength)
           {
               result[index]= mid.get(j);
               index++;
               j++;
           }
           else if(index<n)
           {
               result[index]= greater.get(k);
               index++;
               k++;
           }
       }
        return result;
    }
}