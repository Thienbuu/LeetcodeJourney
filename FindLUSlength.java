class Solution {
    public int findLUSlength(String a, String b) {
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        
        int aLength = aChars.length;
        int bLength = bChars.length;
        if (aLength != bLength) return Math.max(aLength, bLength);
        
        int aIdx = 0;
        for (char c : aChars) {
            if (bChars[aIdx] == c) aIdx++;
            if (aIdx == aLength) return -1;
        }
        
        return aLength;
    }
}
