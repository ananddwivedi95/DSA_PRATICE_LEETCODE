class Solution {
    public long maximumTripletValue(int[] arr) {
        int[] leftMost= new int[arr.length];
        int[] rightMost=new int[arr.length];
        leftMost[0]=0;
        int result=0;
        //leftMost pre Calculation
        for(int i=1;i<arr.length;i++)
        {
            result=Math.max(result,arr[i-1]);
            leftMost[i]=result;
        }
        rightMost[arr.length-1]=0;
        result=0;
        for(int i=arr.length-2;i>=0;i--)
        {
            result=Math.max(result,arr[i+1]);
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