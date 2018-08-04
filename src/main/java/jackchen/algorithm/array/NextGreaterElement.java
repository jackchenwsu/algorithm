package jackchen.algorithm.array;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {

    /*
     * 496. You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2.
     *      Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
     *      The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2.
     *      If it does not exist, output -1 for this number.
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int [] res = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums2.length; i++) {

            while (!stack.isEmpty() && stack.peek() < nums2[i])
            {
                map.put(stack.pop(), nums2[i]);
            }

            stack.push(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.getOrDefault(nums1[i], -1);
        }

        return res;
    }
}
