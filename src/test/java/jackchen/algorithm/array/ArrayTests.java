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

    @Test
    public void multipyTest() {
        MultiplyStrings test = new MultiplyStrings();
        String num1 = "123";
        String num2 = "456";
        String expected = "56088";

        String actual = test.multiply(num1, num2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multipyTest2() {
        MultiplyStrings test = new MultiplyStrings();
        String num1 = "1";
        String num2 = "1";
        String expected = "1";

        String actual = test.multiply(num1, num2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void jumpGameTest() {
        JumpGame  game = new JumpGame();
        int [] A = {2, 3, 1, 1, 4};
        int actual = game.jumpTimes(A);
        Assert.assertEquals( 2, actual);
    }

    @Test
    public void removeDuplicatesTest() {
        RemoveDupplicates rd = new RemoveDupplicates();
        int [] A = {1, 2, 5, 5, 11, 11, 11, 13};
        int [] expected = {1, 2, 5, 11, 13, 11, 11, 13};
        int actual = rd.removeDuplicates(A);
        Assert.assertEquals(5, actual);
        Assert.assertArrayEquals(expected, A);
    }

    @Test
    public void removeElementsTest()
    {
        RemoveDupplicates rd = new RemoveDupplicates();
        int [] A = {3, 2, 2, 3};
        int [] expected = {2, 2, 2, 3};
        int actual = rd.removeElements2(A, 3);
        Assert.assertArrayEquals(expected, A);
    }

    @Test
    public void maxProfitTest()
    {
        BuyAndSellStock stock = new BuyAndSellStock();
        int [] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = stock.maxProfit(prices);
        Assert.assertEquals(5, maxProfit);
    }
}
