class Solution {
    public int lengthOfLastWord(String s) {
        int length = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (length != -1 && s.charAt(i) == ' ') {
                break;
            }
            
            if (s.charAt(i) != ' ') {
                length++;
            }
        }
        return length + 1;
    }
}
