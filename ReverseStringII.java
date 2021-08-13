class Solution {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0, length = chars.length; i < length; i+= k*2) {
            //Find start and end indices of segment
            int endIdx = i + k >= length ? length - 1 : i + k - 1;
            int startIdx = i;
            //Swap characters in segment
            while (startIdx < endIdx) {
                char temp = chars[startIdx];
                chars[startIdx++] = chars[endIdx];
                chars[endIdx--] = temp; 
            }
        }
        return String.valueOf(chars);
    }
}
