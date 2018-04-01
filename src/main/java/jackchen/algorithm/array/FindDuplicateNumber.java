package jackchen.algorithm.array;

public class FindDuplicateNumber {

    /*
     * 287. Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist.
     * Assume that there is only one duplicate number, find the duplicate one.
     */
    public int findDuplicate(int[] nums) {

        int tortoise = nums[0];
        int hare = nums[0];

        do{
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        }
        while (tortoise != hare);

        int ptr1 = nums[0];
        int ptr2 = tortoise;
        while (ptr1 != ptr2) {
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }

        return ptr1;
    }
}