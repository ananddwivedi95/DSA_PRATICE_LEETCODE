class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // Sort intervals based on the end time (not the start time) for optimal removal count
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int count = 0;
        int n = intervals.length;
        int i = 0; // Points to the last non-overlapping interval

        for (int j = 1; j < n; j++) {
            int[] cur_interval = intervals[i];
            int[] next_interval = intervals[j];

            int cs = cur_interval[0]; // Current start
            int ce = cur_interval[1]; // Current end

            int ns = next_interval[0]; // Next start
            int ne = next_interval[1]; // Next end

            if (ce <= ns) { // No overlap, move the pointer
                i = j;
            } else { // Overlapping interval found
                count++; // We need to remove one interval
                if (ce > ne) { 
                    // Remove the interval with the larger end time to keep the smaller one
                    i = j;
                }
            }
        }
        return count;
    }
}
