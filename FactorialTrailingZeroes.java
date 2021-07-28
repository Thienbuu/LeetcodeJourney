class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        int t = 0;
        while (n >= 5) {
            n = n / 5;
            count+= n;
        }
        return count;
    }
    
    //Recursion
    // public int trailingZeroes(int n) {
    //     if (n < 5) return 0;
    //     return n/5 + trailingZeroes(n/5);
    // }
}
