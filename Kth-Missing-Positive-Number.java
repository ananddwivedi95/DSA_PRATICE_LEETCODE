class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> result= new ArrayList<>();
        int i=0;
        int num=1;
        while(i<arr.length)
        {
            if(arr[i]==num)
            {
                i++;
                num++;
            }
            else
            {
                result.add(num);
                num++;
            }
        }
        if(result.isEmpty() ||result.size()<k)
        {
            for(int j=arr[arr.length-1]+1;j<=arr[arr.length-1]+k;j++)
            {
                result.add(j);
            }
        }
        return result.get(k-1);
    }
}