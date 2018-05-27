package jackchen.algorithm.Math;

import java.util.HashSet;

public class JewelsinStones {

    /*
     * 771. You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.
     * You want to know how many of the stones you have are also jewels.
     */
    public int numJewelsInStones(String J, String S) {
        int num = 0;
        HashSet<Character> set = new HashSet<Character>();
        for(int i=0; i<J.length(); i++)
        {
            set.add(J.charAt(i));
        }

        for(int j=0; j<S.length(); j++)
        {
            if(set.contains(S.charAt(j)))
            {
                num++;
            }
        }

        return num;
    }
}
