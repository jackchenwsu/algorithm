package jackchen.algorithm.String;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinations {

    String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    /*
     * 17. Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
     * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
     */
    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if(digits.isEmpty()) return ans;

        ans.add("");
        for(int i=0; i<digits.length(); i++) {
            int x = Character.getNumericValue(digits.charAt(i));

            while(ans.peek().length() == i)
            {
                String t = ans.remove();
                for(char s : mapping[x].toCharArray())
                {
                    ans.add(t+s);
                }
            }

        }

        return ans;
    }
}
