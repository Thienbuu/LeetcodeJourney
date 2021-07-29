class Solution {
    public boolean isHappy(int n) {
        //if n = 4, there will be endlessly cycle
        while (n != 4) {
            int sum = 0;
            while (n != 0) {
                sum += Math.pow(n%10, 2);
                n /= 10;
            }
            n = sum;
            if (n == 1) return true;
        }
        return false;
    }
}
