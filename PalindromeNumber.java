class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        if (x < 0) { return false; }
        int result = 0;
        while (temp != 0) {
            if (result > Integer.MAX_VALUE / 10) {
                return false;
            }
            result = result * 10 +  temp % 10;
            temp /= 10;

        }
        return result == x;
    }
}
