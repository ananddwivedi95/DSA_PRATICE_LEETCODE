class Solution {
    public long maximumTripletValue(int[] arr) {
        int leftMost[]=new int[arr.length];
        int rightMost[]= new int[arr.length];

        //leftmost maximum
        leftMost[0]=0;
        int result=0;
        for(int i=1;i<arr.length;i++)
        {
             result=Math.max(arr[i-1],result);
             leftMost[i]=result;
        }
        rightMost[arr.length-1]=0;
        result=0;
        for(int i=arr.length-2;i>=0;i--)
        {
            result=Math.max(arr[i+1],result);
            rightMost[i]=result;
        }
        long finalResult=0;
        for(int i=1;i<arr.length;i++)
        {
            finalResult=Math.max(finalResult,(long)(leftMost[i]-arr[i])*rightMost[i]);
        }
        return finalResult;

    }
}