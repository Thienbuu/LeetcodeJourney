class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }

        int h = haystack.length();
        int n = needle.length();
        
        for (int i = 0; i < h - n + 1; i++) {
            // check if the first and the last character of needle contained in haystack
            if (haystack.charAt(i) == needle.charAt(0) && haystack.charAt(i + n - 1) == needle.charAt(n - 1)) {
                // compare every character of needle to haystack from index i
                for (int j = 0; j < n && haystack.charAt(i + j) == needle.charAt(j); j++) {
                    // if the last index of needle
                    if (j == needle.length() - 1) {
                        return i;
                    }
                }
            }
        }
        
        return -1;
    }
}
