package jackchen.algorithm.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RandomizedSet {

    private ArrayList<Integer> nums;
    private HashMap<Integer, Integer> locs;
    private Random rand = new Random();

    /** Initialize your data structure here. */
    public RandomizedSet() {
        nums = new ArrayList<Integer>();
        locs = new HashMap<Integer, Integer>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (locs.containsKey(val))
            return false;

        locs.put(val, nums.size());
        nums.add(val);

        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!locs.containsKey(val))
            return false;

        int index = locs.get(val);

        if (index < nums.size() - 1) {
            nums.set(index, nums.get(nums.size() - 1));
            locs.replace(nums.get(nums.size() - 1), index);
        }

        locs.remove(val);
        nums.remove(nums.size()-1);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return nums.get(rand.nextInt(nums.size()));
    }
}
