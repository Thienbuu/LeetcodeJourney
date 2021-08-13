class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) return true;
        char[] chars = word.toCharArray();
        char firstChar = chars[0];
        char secondChar = chars[1];
        if (!isUpperChar(firstChar) && isUpperChar(secondChar)) return false;
        boolean isUpper = isUpperChar(secondChar);
        for (int i = 2; i < chars.length; i++) {
            if (isUpper^isUpperChar(chars[i])) return false;
        }   
        return true;
    }
            
    public boolean isUpperChar(char c) {
        return c >= 'A' && c <= 'Z';
    }
}
