package jackchen.algorithm.array;

public class PlusOne {
    public int[] plusONe(int[] A) {
        for (int i=A.length-1; i>=0; i--)
        {
            if (A[i]==9)
            {
                A[i]=0;
            }
            else
            {
                A[i]++;
                return A;
            }
        }

        int[] B = new int[A.length+1];
        B[0] = 1;
        return B;
    }
}