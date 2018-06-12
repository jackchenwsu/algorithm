package jackchen.algorithm.String;

import java.util.ArrayDeque;
import java.util.Stack;

public class LengthLongestPath {

    /*
     * 388. The string "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"
     * Given a string representing the file system in the above format, return the length of the longest absolute path
     * to file in the abstracted file system. If there is no file in the system, return 0.
     */
    public int lengthLongestPath(String input) {
      Stack<Integer> stack = new Stack<Integer>();
        stack.push(0); // "dummy" length
        int maxLen = 0;
        for(String s:input.split("\n")){
            int lev = s.lastIndexOf("\t")+1; // number of "\t"
            while(lev+1<stack.size()) stack.pop(); // find parent
            int len = stack.peek()+s.length()-lev+1; // remove "/t", add"/"
            stack.push(len);
            // check if it is file
            if(s.contains(".")) maxLen = Math.max(maxLen, len-1);
        }
        return maxLen;
    }
}
