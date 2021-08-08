/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int high = n; 
        int low = 1;
        while (high >= low) {
            int mid = (high - low)/2 + low;
            if (guess(mid) == -1) high = mid-1;
            if (guess(mid) == 1) low = mid+1;
            if (guess(mid) == 0) return mid;
        }
        return low;
    }
}
