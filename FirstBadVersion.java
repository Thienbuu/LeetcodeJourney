/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    //Use binary search to optimize 
    //Time complexity: O(log(n))
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while (low < high) {
            int mid = (high - low)/2 + low;
            if (isBadVersion(mid)) high = mid;
            else low = mid + 1;
        }
        return low;
    }
}
