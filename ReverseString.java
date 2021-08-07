class Solution {
    public void reverseString(char[] s) {
        int low = 0;
        int high = s.length - 1;
        while (high > low) {
            char temp = s[high];
            s[high--] = s[low];
            s[low++] = temp;
        }
    }
}
