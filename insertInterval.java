/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */

class Solution {
    /**
     * Insert newInterval into intervals.
     * @param intervals: Sorted interval list.
     * @param newInterval: A new interval.
     * @return: A new sorted interval list.
     */
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<Interval>();
        // write your code here
        if ((intervals == null || intervals.size() == 0) && newInterval == null) {
            return result;
        }
        int pos = 0;
        for (Interval interval : intervals) {
            if (interval.start > newInterval.end) {
                result.add(interval);
            }
            else if (interval.end < newInterval.start) {
                result.add(interval);
                pos++;
            }
            else {
                newInterval.start = Math.min(interval.start, newInterval.start);
                newInterval.end = Math.max(interval.end, newInterval.end);
            }
        }
        result.add(pos, newInterval);
        return result;
    }
    
}
