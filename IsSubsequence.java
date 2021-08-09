class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        int sIdx = 0;
        int tIdx = 0;
        while (sIdx < sChars.length && tIdx < tChars.length) {
            char sC = sChars[sIdx];
            char tC = tChars[tIdx];
            if (sC == tC) {
                sIdx++;
                tIdx++;
            }
            else tIdx++;
        }
        return sIdx >= sChars.length;
    }
}
