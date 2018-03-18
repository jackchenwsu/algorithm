package jackchen.algorithm.array;


/**
 * 75. Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 */
public class DutchNationalFlag {

    public void sortColors(int[] A, int n) {
        int high = n-1, low = 0;

        for (int i=0; i<=high; i++)
        {
            while (A[i]==2 && i<high) {
                int temp = A[i];
                A[i] = A[high];
                A[high] = temp;
                high--;
            }

            while (A[i]==0 && i>low) {
                int temp = A[i];
                A[i] = A[low];
                A[low] = temp;
                low++;
            }
        }
    }
}
