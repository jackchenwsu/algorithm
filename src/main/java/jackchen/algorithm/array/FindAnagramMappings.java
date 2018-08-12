package jackchen.algorithm.array;

import java.util.HashMap;

public class FindAnagramMappings {

    /*
     * 760. Given two lists Aand B, and B is an anagram of A. B is an anagram of A means B is made by randomizing the order of the elements in A.
     *      We want to find an index mapping P, from A to B. A mapping P[i] = j means the ith element in A appears in B at index j.
     *      These lists A and B may contain duplicates. If there are multiple answers, output any of them.
     */
    public int[] anagramMappings(int[] A, int[] B) {
        HashMap<Integer, Integer> D = new HashMap();
        for (int i = 0; i < B.length; ++i)
            D.put(B[i], i);

        int[] ans = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            ans[i] = D.get(A[i]);
        }

        return ans;
    }
}
