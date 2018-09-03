package jackchen.algorithm.array;

public class MultiplyStrings {
    /*
     * 43. Given two non-negative integers num1 and num2 represented as strings,
     *     return the product of num1 and num2, also represented as a string.
     */
    public String multiply(String num1, String num2) {
        int n = num1.length(), m = num2.length();
        int [] value = new int[n+m];

        for (int i = n - 1; i >= 0; i--) {
            for (int j= m - 1; j >= 0; j--) {
                int mul = (num2.charAt(j) - '0') * (num1.charAt(i) - '0');
                int p1 = i + j, p2= i + j + 1;
                int sum = mul + value[p2];

                value[p2] = sum%10;
                value[p1] += sum/10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int p : value) {
            if (!(sb.length() == 0 && p == 0))
                sb.append(p);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
