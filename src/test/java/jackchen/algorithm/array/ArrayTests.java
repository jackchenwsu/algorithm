package jackchen.algorithm.array;

import org.junit.Test;
import org.junit.Assert;
import org.junit.experimental.theories.suppliers.TestedOn;

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

    @Test
    public void maxProfit2Test()
    {
        BuyAndSellStock stock = new BuyAndSellStock();
        int [] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = stock.maxProfit2_1(prices);
        Assert.assertEquals(7, maxProfit);
        maxProfit = stock.maxProfit2_2(prices);
        Assert.assertEquals(7, maxProfit);
    }

    @Test
    public void containMostWaterTest()
    {
        ContainMostWater water = new ContainMostWater();
        int [] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxArea = water.maxArea(heights);
        Assert.assertEquals(49, maxArea);
    }

    @Test
    public void maxSubarrayTest()
    {
        MaximumSubarray maxSubarray = new MaximumSubarray();
        int [] array = {-2,1,-3,4,-1,2,1,-5,4};
        int actual = maxSubarray.maxSubarray(array);
        Assert.assertEquals(6, actual);
    }

    @Test
    public void moveZerosTest()
    {
        MoveZeroes move = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        move.moveZeroes(nums);
        int[] expected = {1, 3, 12, 0, 0};
        Assert.assertArrayEquals(expected, nums);
    }

    @Test
    public void pascalTriangelTest()
    {
        PascalTriangle test = new PascalTriangle();
        test.generate(5);
    }

    @Test
    public void RotateImageTest()
    {
        RotateImage image = new RotateImage();
        int[][] matrix = new int[][] { {1, 2, 3,}, {4, 5, 6}, {7, 8, 9}};
        image.rotate(matrix);
        Assert.assertArrayEquals(new int[] {7, 4, 1}, matrix[0]);
        Assert.assertArrayEquals(new int[] {8, 5, 2}, matrix[1]);
        Assert.assertArrayEquals(new int[] {9, 6, 3}, matrix[2]);
    }

    @Test
    public void containsNearbyDuplicateTest()
    {
        ContainsDuplicate cd = new ContainsDuplicate();
        Assert.assertTrue(cd.containsNearbyDuplicate(new int[] {99, 99}, 2));
    }

    @Test
    public void searchRotatedSortedArray()
    {
        SearchRotatedSortedArray srsa = new SearchRotatedSortedArray();
        int[] nums = new int[] {1, 3};

        Assert.assertEquals(-1, srsa.search(nums, 0));
    }
}
