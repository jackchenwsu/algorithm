package jackchen.algorithm.array;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KSmallestPairs {

    /*
     * 373. You are given two integer arrays nums1 and nums2 sorted in ascending order and an integer k.
     * Define a pair (u,v) which consists of one element from the first array and one element from the second array.
     * Find the k pairs (u1,v1),(u2,v2) ...(uk,vk) with the smallest sums.
     */
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        List<int[]> res = new ArrayList<int[]>();
        if(nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0 || k <= 0) return res;

        int n = nums1.length;
        int m = nums2.length;

        PriorityQueue<Tuple> pq = new PriorityQueue<Tuple>();
        for (int j = 0; j < m; j++) pq.add(new Tuple(0, j, nums1[0] + nums2[j]));

        for(int i = 0; i < Math.min(k, m *n); i++)
        {
            Tuple t = pq.poll();

            res.add(new int[] {nums1[t.x], nums2[t.y]});

            if (t.x == n - 1) continue;

            pq.add(new Tuple(t.x + 1, t.y, nums1[t.x + 1] + nums2[t.y]));
        }

        return res;
    }

        class Tuple implements Comparable<Tuple> {
        int x, y, val;

        public Tuple(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }

        @Override
        public int compareTo(Tuple that) {
            return this.val - that.val;
        }
    }
}
