package jackchen.algorithm.String;

public class StringCompression {

    /*
     * 443. Given an array of characters, compress it in-place.
     *      The length after compression must always be smaller than or equal to the original array.
     *      Every element of the array should be a character (not int) of length 1.
     *      After you are done modifying the input array in-place, return the new length of the array.
     */
    public int compress(char[] chars) {
        int anchor = 0, write = 0;
        for (int read = 0; read < chars.length; read++) {
            if (read + 1 == chars.length || chars[read] != chars[read+1]) {
                chars[write++] = chars[anchor];

                if (read > anchor) {
                    for (char c : ("" + (read - anchor + 1)).toCharArray()) {
                        chars[write++] = c;
                    }
                }

                anchor = read + 1;
            }
        }

        return write;
    }
}
