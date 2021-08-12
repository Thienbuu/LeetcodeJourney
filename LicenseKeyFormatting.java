class Solution {
    public String licenseKeyFormatting(String s, int k) {
        char[] sArr = s.toCharArray();
        StringBuilder result = new StringBuilder();
        int partLength = 0;
        for (int i = sArr.length - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != '-') {
                if (partLength > 0 && partLength%k == 0) result.append('-');
                partLength++;
                if (c >= 'a' && c <= 'z') c -= 32;
                result.append(c);
            }
        }
        return result.reverse().toString();
    }
}
