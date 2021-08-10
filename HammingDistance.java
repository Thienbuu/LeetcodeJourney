class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        while (x != 0 || y != 0) {
            int xLastDigit = x&1;
            int yLastDigit = y&1;
            if (xLastDigit != yLastDigit) count++;
            x >>= 1;
            y >>= 1;
        }
        return count;
    }
}
