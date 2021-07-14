class Solution {
    public int climbStairs(int n) {
        int prev = 0;
        int curr = 1;
        for (int i = 1; i < n; i++) {
            curr += prev;
            prev = curr - prev;
        }
        
        return curr + prev;
    }
}
