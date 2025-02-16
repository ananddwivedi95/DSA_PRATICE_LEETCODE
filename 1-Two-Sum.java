class Solution {
    public int[] twoSum(int[] nums, int target) {
       int arr_1[]=new int[2];
    \tArrayList<Integer> hss= new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        { 
        \tint current_value=nums[i];
        \tint required_value=target-current_value;
        \tif(hss.contains(required_value))
        \t{
        \t\tint index=hss.indexOf(required_value);
        \t\tarr_1[0]=index;
        \t\tarr_1[1]=i;
        \t\treturn arr_1;
        \t}
        \thss.add(nums[i]);
        \t
        \t
        }
        return arr_1;
        }
        
    }

    
