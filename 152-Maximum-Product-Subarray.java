class Solution {
    public int maxProduct(int[] arr) {
        int maxProduct=Integer.MIN_VALUE;
        int prefix=1;
        int suffix=1;
        for(int i=0;i<arr.length;i++)
        {
           if(prefix==0)
           prefix=1;
           if(suffix==0)
           suffix=1;
           
          prefix = prefix*arr[i];
          suffix=suffix*arr[arr.length-1-i];
           
           maxProduct=Math.max(maxProduct,Math.max(prefix,suffix));
              
        }
        return maxProduct;
    }
}