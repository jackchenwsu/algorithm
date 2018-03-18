package jackchen.algorithm.array;

import org.junit.Test;
import org.junit.Assert;

public class ArrayTests {

    @Test
    public void sortColorTest() {
        DutchNationalFlag test1 = new DutchNationalFlag();
        int [] A = {0, 1, 2, 0, 1, 0, 1, 2};
        test1.sortColors(A, A.length);
        int [] expected = {0, 0, 0, 1, 1, 1, 2, 2};
        Assert.assertArrayEquals(expected, A);
    }

    @Test
    public void sortColorTest2() {
        DutchNationalFlag test1 = new DutchNationalFlag();
        int [] A = {1, 2, 0};
        test1.sortColors(A, A.length);
        int [] expected = {0, 1, 2};
        Assert.assertArrayEquals(expected, A);
    }

}
