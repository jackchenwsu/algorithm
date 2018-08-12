package jackchen.algorithm.array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class AdvantageShuttle {

    /*
     * 870. Given two arrays A and B of equal size, the advantage of A with respect to
     *      B is the number of indices i for which A[i] > B[i].
     *      Return any permutation of A that maximizes its advantage with respect to B.
     */
    public int[] advantageCount(int[] A, int[] B) {
        Arrays.sort(A);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->b[0]-a[0]);

        for (int i = 0; i < B.length; i++) {
            pq.add(new int[] {B[i], i});
        }

        int lo = 0, hi = A.length - 1;
        int[] res = new int[A.length];
        while(!pq.isEmpty())
        {
            int[] cur = pq.poll();

            if (A[hi] > cur[0]) {
                res[cur[1]] = A[hi--];
            }
            else
            {
                res[cur[1]] = A[lo++];
            }
        }

        return res;
    }
}
