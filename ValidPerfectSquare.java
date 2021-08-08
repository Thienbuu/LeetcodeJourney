/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        int high = num/2;
        int low = 1;
        while (high >= low) {
            int mid = (high - low)/2 + low;
            if (mid * mid == num) return true;
            if (mid < num/mid) low = mid+1;
            else high = mid-1;
        }
        return false;
    }

}
