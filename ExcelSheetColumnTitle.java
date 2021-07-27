class Solution {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            n--;
            int current = n%26;
            char c = (char)('A' + current);
            result.append(c);
            n /= 26;
        }
        return result.reverse().toString();
    }
}
