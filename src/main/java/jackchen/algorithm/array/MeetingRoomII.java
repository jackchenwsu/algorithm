package jackchen.algorithm.array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomII {

    /*
     * 253. Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei),
     *      find the minimum number of conference rooms required.
     */
    public int minMeetingRooms(Interval[] intervals) {
        int start[] = new int[intervals.length];
        int end[] = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++)
        {
            start[i] = intervals[i].start;
            end[i] = intervals[i].end;
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int room = 0;
        int endPtr = 0;
        for (int i = 0; i < intervals.length; i++)
        {
            if (start[i] < end[endPtr]) room++;
            else
            {
                endPtr++;
            }
        }

        return room;
    }

    public int minMeetingRooms2(Interval[] intervals) {
        if (intervals == null || intervals.length == 0)
            return 0;

        Arrays.sort(intervals, (a, b) -> a.start - b.start);

        PriorityQueue<Interval> pq = new PriorityQueue<Interval>(intervals.length, (a, b) -> a.end - b.end);
        pq.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++)
        {
            Interval cur = pq.poll();

            if (intervals[i].start < cur.end)
            {
                pq.offer(intervals[i]);
            }
            else
            {
                cur.end = intervals[i].end;
            }

            pq.offer(cur);
        }

        return pq.size();
    }
}
