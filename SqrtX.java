class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        
        int high = x;
        int low = 1;
        int mid = 1;
        while (high > low) {
            mid = (high - low) / 2 + low;
            //perfect square, can not overflow because x is not overflow
            if (mid * mid == x) {
                return mid;
            }
            //power of mid bigger than x, using devide to avoid overflow 
            else if (x / mid < mid) {
                high = mid;
            }
            //power of mid smaller than x
            else {
                //avoid infinite loop
                if (low == mid) break;
                low = mid;
            }
        }
        
        return mid;
    }
}
