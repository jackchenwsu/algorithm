package jackchen.algorithm.String;

import java.util.*;

public class MostCommonWord {

    /*
     * 819. Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words.
     *      It is guaranteed there is at least one word that isn't banned, and that the answer is unique.
     *      Words in the list of banned words are given in lowercase, and free of punctuation.  Words in the paragraph are not case sensitive.  The answer is in lowercase.
     */
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.replaceAll("\\pP", "").toLowerCase().split("\\s+");
        Set<String> bannedSet = new HashSet<String>(Arrays.asList(banned));
        HashMap<String, Integer> maps = new HashMap<>();
        for(String s : words)
        {
            if(!bannedSet.contains(s)) {
                maps.put(s, maps.getOrDefault(s, 0) + 1);
            }
        }

        return Collections.max(maps.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
