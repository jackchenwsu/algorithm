package jackchen.algorithm.String;

public class CompareVersionNumbers {
    /*
     * 165. Compare two version numbers version1 and version2.
     *      If version1 > version2 return 1; if version1 < version2 return -1;otherwise return 0.
     *      You may assume that the version strings are non-empty and contain only digits and the . character.
     */
    public int compareVersion(String version1, String version2) {
        String[] levels1 = version1.split("\\.");
        String[] levels2 = version2.split("\\.");

        int length = Math.max(levels1.length, levels2.length);
        for (int i=0; i<length; i++) {
            Integer v1 = i < levels1.length ? Integer.parseInt(levels1[i]) : 0;
            Integer v2 = i < levels2.length ? Integer.parseInt(levels2[i]) : 0;
            int compare = v1.compareTo(v2);
            if (compare != 0) {
                return compare;
            }
        }

        return 0;
    }
}
