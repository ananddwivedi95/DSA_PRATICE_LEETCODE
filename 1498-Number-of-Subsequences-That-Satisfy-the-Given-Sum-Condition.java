import java.util.Arrays;

class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int mod = 1_000_000_007;
        int n = nums.length;
        
        // Precompute powers of 2 modulo mod.
        int[] pow = new int[n];
        pow[0] = 1;
        for (int i = 1; i < n; i++) {
            pow[i] = (int) ((pow[i - 1] * 2L) % mod);
        }
        
        int left = 0, right = n - 1;
        int ans = 0;
        
        while (left <= right) {
            // If the smallest and largest can form a valid subsequence
            if (nums[left] + nums[right] <= target) {
                // All subsequences using nums[left] as the minimum are valid.
                ans = (ans + pow[right - left]) % mod;
                left++;
            } else {
                // If they don't form a valid pair, decrease right.
                right--;
            }
        }
        return ans;
    }
}
