class Solution {
    //Explanation Math problem: https://leetcode.com/problems/arranging-coins/discuss/162814/Python-O(1)-Math-Solution-Fully-Explained
    // public int arrangeCoins(int n) {
    //     return (int)((-1 + Math.sqrt(1 + 8 * (long)n)) / 2);
    // }
    
    public int arrangeCoins(int n) {
        int level = 0;
        while (n != 0) {
            n -= ++level;
            if (n < 0) return --level;
        }
        return level;
    }
}
