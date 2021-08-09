class Solution {
    public int countSegments(String s) {
        int segments = 0;
        char[] sChars = s.toCharArray();
        for (int i = 0; i < sChars.length; i++) {
            if (sChars[i] != ' ' && (i == 0 || sChars[i-1] == ' '))
                segments++;
        }
        return segments;
    }
}
