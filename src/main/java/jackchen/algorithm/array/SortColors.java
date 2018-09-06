package jackchen.algorithm.array;

public class SortColors {

    /*
     * 75. Given an array with n objects colored red,
     *     white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
     *     Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
     */
    public void sortColors(int[] nums) {
        int second=nums.length-1, zero=0;
        for (int i=0; i<=second; i++) {
            while (nums[i]==2 && i<second) swap(nums, i, second--);
            while (nums[i]==0 && i>zero) swap(nums, i, zero++);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
