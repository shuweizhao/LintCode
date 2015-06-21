/**
 * Definition of Interval:
 * public class Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */

class Solution {
    /**
     * @param intervals: Sorted interval list.
     * @return: A new sorted interval list.
     */
    public List<Interval> merge(List<Interval> intervals) {
        // write your code here
        List<Interval> res = new ArrayList<Interval>();
        if(intervals == null || intervals.size() <= 1) {
            return intervals;
        }
		//sort according to start of interval
        Collections.sort(intervals, new intervalComparator());
        Interval last = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            Interval curr = intervals.get(i);
			//if crossed with last interval, update end of last interval
            if (curr.start <= last.end) {
                last.end = Math.max(last.end, curr.end);
            }
            else {
                res.add(last);
                last = curr;
            }
        }
        res.add(last);
        return res;
    }
    private class intervalComparator implements Comparator<Interval> {
        public int compare(Interval a, Interval b) {
            return a.start - b.start;
        }
    }
}
