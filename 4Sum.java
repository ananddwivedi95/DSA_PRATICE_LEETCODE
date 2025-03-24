class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {


       Arrays.sort(arr);
       ArrayList<List<Integer>> result= new ArrayList<>();
       for(int i=0;i<arr.length-3;i++)
       {
        if(i>0 && arr[i]==arr[i-1])
        {
            continue;
        }
          for(int j=i+1;j<arr.length-2;j++)
          {
            if(j>i+1 && arr[j]==arr[j-1])
            {
                continue;
            }
                int k=j+1;
                int l=arr.length-1;
                while(k<l)
                {
                    long sum=(long)arr[i]+arr[j]+arr[k]+arr[l];
                    if(sum==target)
                    {
                        ArrayList<Integer> ar= new ArrayList<>();
                        Collections.addAll(ar,arr[i],arr[j],arr[k],arr[l]);
                        result.add(ar);
                        k++;
                        l--;
                        while(k<l && arr[k]==arr[k-1])
                        {
                            k++;
                        }
                        while(k<l && arr[l]==arr[l+1])
                        {
                            l--;
                        }
                    }
                    else if(sum>target)
                    {
                        l--;
                    }
                    else if(sum<target)
                    {
                        k++;
                    }
                }
          }
       }
       return result;
    }
}