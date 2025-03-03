class Solution {
    public int[] pivotArray(int[] arr, int pivot) {
        int i=0;
       ArrayList<Integer> smallest=new ArrayList<>();
       ArrayList<Integer> mid=new ArrayList<>();
       ArrayList<Integer> greater= new ArrayList<>();
       while(i<arr.length)
       {
           if(arr[i]<pivot)
           {
               smallest.add(arr[i]);
               i++;
           }
           else if(arr[i]==pivot)
           {
               mid.add(arr[i]);
               i++;
           }
           else if(arr[i]>pivot)
           {
               greater.add(arr[i]);
               i++;
           }

       }
       int [] result= new int[arr.length];
       int index=0;
       i=0; //smallest
        while(i<smallest.size())
        {
            result[index]=smallest.get(i);
            index++;
            i++;
        }
        i=0;//mid
        while(i<mid.size())
        {
            result[index]=mid.get(i);
            index++;
            i++;
        }
        i=0;//greater
        while(i<greater.size())
        {
            result[index]=greater.get(i);
            index++;
            i++;
        }
        return result;
    }
}