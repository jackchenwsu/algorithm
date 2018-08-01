package jackchen.algorithm.array;

public class GasStation {

    /*
     * 134. There are N gas stations along a circular route, where the amount of gas at station i is gas[i].
     * You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1).
     * You begin the journey with an empty tank at one of the gas stations.
     * Return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1.
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int submax = Integer.MAX_VALUE;
        int total = 0;
        int start = -1;

        for (int i = 0; i < n; i++)
        {
            total += gas[i] - cost[i];

            if (total < submax)
            {
                submax = total;
                start = i + 1;
            }
        }

        return total < 0? -1 : start%n;

    }
}
