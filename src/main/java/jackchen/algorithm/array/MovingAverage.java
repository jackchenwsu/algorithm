package jackchen.algorithm.array;

public class MovingAverage {

    private int num = 0;
    private int index = 0;
    private int [] window;
    private double sum = 0;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.window = new int[size];
    }

    public double next(int val) {
        if (this.num < this.window.length) this.num++;
        sum = sum + val - window[index];
        window[index] = val;
        index = (index + 1) % window.length;

        return this.sum/this.num;
    }
}
