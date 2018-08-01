package jackchen.algorithm.array;

public class HIndesx {

    /*
     * 274. Given an array of citations (each citation is a non-negative integer) of a researcher, write a function to compute the researcher's h-index.
     * 275. Given an array of citations sorted in ascending order (each citation is a non-negative integer) of a researcher, write a function to compute the researcher's h-index.
     * According to the definition of h-index on Wikipedia: "A scientist has index h if h of his/her N papers have at least h citations each, and the other N − h papers have no more than h citations each."
     */
    public int hIndex(int[] citations) {
        int len = citations.length;
        int i = 0, j = len - 1;
        while (i <=j)
        {
            int mid = (i + j) >> 1;
            if (citations[mid] == len - mid)
                return len - mid;
            else if (citations[mid] > len - mid)
            {
                j = mid -1;
            }
            else
            {
                i = mid + 1;
            }
        }

        return len - i;
    }
}