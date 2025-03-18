class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
    //    HashSet<List<Integer>>set= new HashSet<List<Integer>>();
\t//    for(int i=0;i<arr.length;i++)
\t//    {   
\t// \t   HashSet<Integer> hs= new HashSet<Integer>();
\t// \t   for(int j=i+1;j<arr.length;j++)
\t// \t   {
\t// \t\t  int third=-(arr[i]+arr[j]);
\t// \t\t  if(hs.contains(third))
\t// \t\t  {
    //               ArrayList<Integer> list= new ArrayList<Integer>();
\t// \t\t\t   list.add(arr[i]);
\t// \t\t\t   list.add(arr[j]);
\t// \t\t\t   list.add(third);
\t// \t\t\t   list.sort(null);
\t// \t\t\t   set.add(list);
\t// \t\t  }
\t// \t\t  else
\t// \t\t  {
\t// \t\t\t  hs.add(arr[j]);
\t// \t\t  }
\t// \t   }
\t//    }
    //    List<List<Integer>> li= new ArrayList<>(set);
    //    return li; 
   
   Arrays.sort(arr);
   ArrayList<List<Integer>> result= new ArrayList<>();
    for(int i=0;i<arr.length;i++)
    {
        if(i>0&& arr[i]==arr[i-1])
        {
            continue;
        }
        int j=i+1;
        int k=arr.length-1;
        while(j<k)
        {
            int sum=arr[i]+arr[j]+arr[k];
            if(sum==0)
            {
                ArrayList<Integer> ar=new ArrayList<>();
                Collections.addAll(ar, arr[i],arr[j],arr[k]);
                result.add(ar);
                j++;
                k--;
                while(j < k && arr[j]==arr[j-1])
                {
                    j++;
                }
                while(j < k && arr[k]==arr[k+1])
                {
                    k--;
                }
            }
            else if(sum>0)
            {
                k--;
            }
            else if(sum<0)
            {
                j++;
            }
        }
    }
    return result;
    }
}