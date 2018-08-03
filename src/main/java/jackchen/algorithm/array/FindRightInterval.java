package jackchen.algorithm.array;

import java.util.Arrays;
import java.util.HashMap;

public class FindRightInterval {
    /*
     * 436. Given a set of intervals, for each of the interval i, check if there exists an interval j whose start point is bigger than or equal to the end point of the interval i,
     * which can be called that j is on the "right" of i.
     * For any interval i, you need to store the minimum interval j's index, which means that the interval j has the minimum start point to build the "right" relationship for interval i.
     * If the interval j doesn't exist, store -1 for the interval i. Finally, you need output the stored value of each interval as an array.
     */
    public int[] findRightInterval(Interval[] intervals) {
        int[] res = new int[intervals.length];

        HashMap<Interval, Integer> hash = new HashMap<>();

        for (int i = 0; i < intervals.length; i++) {
            hash.put(intervals[i], i);
        }

        Arrays.sort(intervals, (a, b) -> a.start - b.start);

        for (int i = 0; i < intervals.length; i++) {
            Interval interval = binary_search(intervals, intervals[i].end, 0, intervals.length - 1);

            res[hash.get(intervals[i])] = interval == null ? -1 : hash.get(interval);
        }

        return res;
    }

    private Interval binary_search(Interval[] intervals, int target, int start, int end) {
        if (start >= end) {
            if (intervals[start].start >= target) {
                return intervals[start];
            }
            return null;
        }
        int mid = (start + end) / 2;
        if (intervals[mid].start < target) {
            return binary_search(intervals, target, mid + 1, end);
        } else {
            return binary_search(intervals, target, start, mid);
        }
    }
}
